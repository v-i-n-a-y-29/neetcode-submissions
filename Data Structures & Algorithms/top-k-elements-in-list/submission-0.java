class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>(); // element -> freq

        for(int num:nums)
        {
            map.put(num , map.getOrDefault(num,0)+1);
        }

        List<List<Integer>> list = new ArrayList<>();

        for(int key:map.keySet())
        {
            list.add(new ArrayList<>(List.of(key , map.get(key))));
        }

        list.sort((a,b) -> b.get(1) - a.get(1)  );
        
        System.out.print(list);

        int ans[] = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = list.get(i).get(0);
        }
        return ans;

    }
}
