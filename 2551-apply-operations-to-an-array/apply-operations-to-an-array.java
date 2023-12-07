class Solution {
     public void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;
        for(int i = j+1; i<nums.length; i++){
            if(nums[i] !=0){
                swap(nums, j, i);
                j++;
            }
        }
    }

    public int[] applyOperations(int[] nums) {
        for(int i =0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                continue;
            } else{
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }

        moveZeroes(nums);
        return nums;

    }
}