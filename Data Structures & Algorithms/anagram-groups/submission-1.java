class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String , List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            char chars[] = strs[i].toCharArray();

            Arrays.sort(chars);

            String sorted = new String(chars);

            if(map.containsKey(sorted)){
               map.get(sorted).add(strs[i]);
            }
            else{
                map.put(sorted , new ArrayList<>());
                map.get(sorted).add(strs[i]);
            }
        }

        System.out.println(map);

        for(List<String> list:map.values())
        {
            res.add(list);
        }

        return res;
    }
}
