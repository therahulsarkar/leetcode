class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int current; int required;
  
        for(int i=0; i<nums.length; i++){
            current = nums[i];
            required = target - current;

            if(map.containsKey(required)){
                return new int[] { map.get(required)  ,i };
            } else{
                map.put(nums[i], i);
            }
        }
        return new int [] {};
    }
}