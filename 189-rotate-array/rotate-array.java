class Solution {
    public  void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        // int n = nums.length;
        // int[] res = new int[n];
        // int pos = 0;

        // for(int i =0; i<n; i++){
        //     pos = (i + k) % n;
        //     res[pos] = nums[i]; 
        // }

        // for(int i = 0; i<n; i++){
        //     nums[i] = res[i];
        // }
    }
}