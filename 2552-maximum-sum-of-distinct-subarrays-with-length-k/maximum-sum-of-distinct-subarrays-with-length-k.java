import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0; 
        long sum = 0; 
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }

        if(map.size() == k){ //Means all the elements are unique
            max = sum;  
        }

        for (int i = k; i < nums.length; i++) {
            int elemToRemove = nums[i-k];
            sum -= elemToRemove;
            map.put(elemToRemove, map.get(elemToRemove) - 1);
            if(map.get(elemToRemove) == 0){ //If the freq of element is 0
                map.remove(elemToRemove);
            }

            int elemToAdd = nums[i];
            sum += elemToAdd;
            map.put(elemToAdd, map.getOrDefault(elemToAdd, 0) + 1);
            

            if(map.size() == k){
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}