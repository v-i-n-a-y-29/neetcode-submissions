class Solution {
    public boolean isPalindrome(String s) {
        //build the string

        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if( Character.isLetter(ch) || Character.isDigit(ch) )
                sb.append(Character.toLowerCase(ch));
        }

        int l=0;
        int r=sb.length()-1;

        while(l<=r)
        {
            if(sb.charAt(l)!=sb.charAt(r))
            return false;

            l++;
            r--;
        }

        System.out.println(sb);

        return true;
    }
}
