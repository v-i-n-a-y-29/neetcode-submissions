class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int l=0;
        int r = n-1;
        int maxi = 0;
        while(l<r)
        {
            int water = Math.min(heights[l],heights[r]) * (r-l);
            maxi = Math.max(maxi , water );

            if(heights[l]<heights[r])
            l++;
            else
            r--;
        }
        return maxi;
    }
}
