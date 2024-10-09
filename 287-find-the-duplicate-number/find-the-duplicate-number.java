// class Solution {
//     public int findDuplicate(int[] nums) {
//         HashSet<Integer> res = new HashSet<>();

//         for(int data : nums){
//             if(res.contains(data)){
//                 return data;
//             }
//             res.add(data);
//         }
//         return -1;
//     }
// }

class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            int curr = Math.abs(nums[i]);
            if(nums[curr] < 0){
                return Math.abs(nums[i]);
            }
            nums[curr] = -nums[curr];
        }
        return -1;
    }
}