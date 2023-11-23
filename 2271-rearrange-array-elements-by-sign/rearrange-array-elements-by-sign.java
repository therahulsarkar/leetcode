class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0;
        int negIndex = 1;
        int[] newArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                newArr[negIndex] = nums[i];
                negIndex += 2;
            } else {
                newArr[posIndex] = nums[i];
                posIndex += 2;
            }
        }

        return newArr;
    }
}