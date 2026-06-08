class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[] = new int[n];

        int prefixProduct[] = new int[n];
        int suffixProduct[] = new int[n];

        prefixProduct[0] = 1;
        suffixProduct[n-1] = 1;
        
        

        for(int i=1;i<n;i++)
        {
            prefixProduct[i]=nums[i-1]*prefixProduct[i-1];

        }

        for(int i=n-2;i>=0;i--)
        {
            suffixProduct[i] = nums[i+1] * suffixProduct[i+1];
        }

        for(int i=0;i<n;i++)
        {
            ans[i] = prefixProduct[i]*suffixProduct[i];
        }


        return ans;

    }
}  
