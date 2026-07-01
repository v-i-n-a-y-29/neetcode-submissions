class Solution {
    public List<String> generateParenthesis(int n) {
        //the output will have n:open and n:close brackets
        List<String> ans = new ArrayList<>();
        solve(n,n,"",ans);
        return ans;

    }

    void solve(int open , int close , String out , List<String> ans )
    {

        if(open==0 && close==0 )
        {
            ans.add(out);
            return;
        }

        if(open>0)
        {
            solve(open-1 , close , out+"(" , ans);
        }

        if(close>open)
        {
            solve(open , close-1 , out+")" , ans);
        }


    }
}