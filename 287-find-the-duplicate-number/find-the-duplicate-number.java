class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();

        for(int data : nums){
            if(res.contains(data)){
                return data;
            }
            res.add(data);
        }
        return -1;
    }
}