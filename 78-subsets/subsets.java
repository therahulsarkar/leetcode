class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int totalSubSets = 1 << n; //same as 2^n
        List<List<Integer>>res = new ArrayList<>();


        for(int i = 0; i<totalSubSets; i++){
            List<Integer> subList = new ArrayList<>();
            for(int j =0; j<n; j++){
                if((i & ( 1<< j)) != 0 ){
                    subList.add(nums[j]);
                }
            }
            res.add(subList);
        }
        return res;
    }
}