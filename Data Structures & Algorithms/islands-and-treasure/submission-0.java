class Pair{
    int first , second;

    Pair(int first , int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public void islandsAndTreasure(int[][] grid) {
        //aah the classic multisource bfs traversal questions

        Queue<Pair> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;

        int vis[][] = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    q.add(new Pair(i,j));
                }
            }
        }

        int level = 1;

        while(!q.isEmpty())
        {
            int size = q.size();

            for(int k=0;k<size;k++)
            {
                Pair curr = q.poll();

                int row = curr.first;
                int col = curr.second;

                int dRow[] = {-1,0,1,0};
                int dCol[] = {0,1,0,-1};

                for(int d=0;d<4;d++)
                {
                    int nrow = row + dRow[d];
                    int ncol = col + dCol[d];

                    if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]==Integer.MAX_VALUE 
                        && vis[nrow][ncol]!=1)
                    {
                        q.add(new Pair(nrow , ncol));
                        vis[nrow][ncol]=1;
                        grid[nrow][ncol] = level;
                        
                    }
                } 
            }
            level++;
        }
    }
}
