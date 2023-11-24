class Solution {
    void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length-1;

        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {

    int replaceIndex = -1;
    int replaceWith = -1;

    for (int i = nums.length - 2; i >= 0; i--) {
        if (nums[i] < nums[i + 1]) {
            replaceIndex = i;
            break;
        }
    }

    if (replaceIndex == -1) {
        reverse(nums, 0);
    } else {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[replaceIndex]) {
                replaceWith = i;
                break;
            }
        }
        swap(nums, replaceIndex, replaceWith);
        reverse(nums, replaceIndex+1);
    }
    // return nums;

    }
}