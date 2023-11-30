class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int length = nums.length;
        int target = length / 3;
        HashMap<Integer, Integer> keyFrequency = new HashMap();
        List<Integer> result = new ArrayList();

        for(int elem : nums){
            
                keyFrequency.put(elem, keyFrequency.getOrDefault(elem, 0)+1);
            
        }

        for (Map.Entry<Integer, Integer> data : keyFrequency.entrySet()) {
             if(data.getValue() > target){
                 result.add(data.getKey());
             }
        }

        return result;
    }
}