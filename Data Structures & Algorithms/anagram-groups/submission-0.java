class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        boolean taken[] = new boolean[strs.length];
        for(int i=0;i<strs.length;i++)
        {
            List<String> temp = new ArrayList<>();
            if(!taken[i])
            {
                temp.add(strs[i]);
                taken[i] = true;
            }
            else
                continue;
            for(int j=i+1;j<strs.length;j++)
            {
                if(isAnagram(strs[i] , strs[j]) && !taken[j])
                {
                    temp.add(strs[j]);
                    taken[j] = true;
                }
            }
            res.add(temp);
        }
        return res;
    }

    boolean isAnagram(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        return false;

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}
