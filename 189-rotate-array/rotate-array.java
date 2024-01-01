class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        int pos = 0;

        for(int i =0; i<n; i++){
            pos = (i + k) % n;
            res[pos] = nums[i]; 
        }

        for(int i = 0; i<n; i++){
            nums[i] = res[i];
        }
    }
}