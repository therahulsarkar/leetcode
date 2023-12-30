class Solution {

     public  boolean possibleSolution(int[] nums, int mid, int k){
        int totalpartition = 1;
        int currSum = 0;

        for(int i = 0; i<nums.length; i++){
            if(currSum + nums[i] <= mid) {currSum += nums[i];}
            else {
                totalpartition ++;
                currSum = nums[i];
         }   
        }

        return totalpartition <= k;
    }

    public int splitArray(int[] nums, int k) {
        int high = 0;
        int low = 0; // Holds the max and min possible range
        // When k is equal to the no of lements in the array then the max among all the
        // elements will be the answer;

        // When k = 1, that means there can be only 1 sub array, so we have to return
        // the sum of all elements in the array

        for (int elem : nums) {
            low = Math.max(low, elem);
            high += elem;

        }

        int mid = 0;
        while (high > low) {
            mid = (high + low) / 2;
            if (possibleSolution(nums, mid, k)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}