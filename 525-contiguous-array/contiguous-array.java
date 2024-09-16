class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int accSum = 0;
        int maxLength = 0;
        map.put(0, -1);

        for(int i = 0; i<nums.length; i++){
            accSum += (nums[i] == 1 ? 1 : -1);

            if(map.containsKey(accSum)){
                int previousOccurance = map.get(accSum);
                maxLength = Math.max(maxLength, i - previousOccurance);
            }else{
                map.put(accSum, i);
            }

        }
        return maxLength;
    }
}