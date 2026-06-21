class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxf=0;
        int l=0;
        int r=0;
        int freq[] = new int[26];
        int maxlen=0;

        while(r<s.length())
        {
            freq[s.charAt(r)-'A']++;
            maxf = Math.max(maxf , freq[s.charAt(r)-'A']);
            int len = r-l+1;
            int changes = len - maxf;

            while( (r-l+1) - maxf >k)
            {
                freq[s.charAt(l)-'A']--;
                //update the maxf
                maxf=0;
                for(int i=0;i<26;i++)
                {
                    maxf = Math.max(maxf , freq[i]);
                }
                l++;
            }
            //now this means the changes are within the limits
            maxlen = Math.max(maxlen , r-l+1);
            r++;
        }
        return maxlen;
    }
}
