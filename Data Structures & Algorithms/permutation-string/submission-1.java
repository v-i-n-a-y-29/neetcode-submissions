class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int freq1[] = new int[26];
       int freq2[] = new int[26];

       if(s2.length()<s1.length())
       return false;

       for(int i=0;i<s1.length();i++)
       {
            freq1[s1.charAt(i)-'a']++;
       }

       //now take the window of len = s1 and search in the exact window length the freq of s1

       int l=0;
       int r=0;
       int k = s1.length();



       while(r<s2.length())
       {
            while(r-l+1>k)
            {
                //decrease the window size from the left
                freq2[s2.charAt(l)-'a']--;
                l++;
            }
            freq2[s2.charAt(r)-'a']++;
            if(Arrays.compare(freq1,freq2)==0)
            return true;
            r++;
       }
       return false;
    }
}
