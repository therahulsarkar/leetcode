class Solution {

    public int[] answerQueries(int[] nums, int[] queries) {
        int[] ans = new int[queries.length];
        Arrays.sort(nums);

        for (int i = 0; i < queries.length; i++) {
            int count = 0; int sum = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] <= queries[i]){
                    if(sum+ nums[j] <= queries[i]){
                        count++;
                        sum += nums[j];
                    } else{
                        break;
                    }
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}
