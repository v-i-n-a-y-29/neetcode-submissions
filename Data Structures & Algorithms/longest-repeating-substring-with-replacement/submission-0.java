class Solution {
    public int characterReplacement(String s, int k) 
    {
        int n = s.length();
        
        //brute force
        // generate all the substrings

        int maxlen = 0;

        for(int i=0;i<n;i++)
        {
            int freq[] = new int[26];
            int maxf = 0;
            for(int j=i;j<n;j++)
            {
                freq[s.charAt(j)-'A']++;
                int len = j-i+1;
                 maxf = Math.max(maxf , freq[s.charAt(j)-'A']);

                int changes = len - maxf;
                if(changes<=k)
                {
                    maxlen = Math.max(maxlen , len);
                }
                else{
                    break;
                }
            }
        }
        return maxlen;

    }
}
