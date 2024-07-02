class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> countFreq = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int[] num : nums){
            for(int elm : num){
                countFreq.put(elm, countFreq.getOrDefault(elm, 0)+1);
                if(countFreq.get(elm) == nums.length){
                    ans.add(elm);
                }
            }
        }

        ans.sort(Comparator.naturalOrder());
        return ans;
    }
}