class Solution {
    public int findMaxK(int[] nums) {
        int max=0;
        for(int num:nums){
            if(num>0 && findMax(num,nums)){
                if(max<num){
                     max=num;
                }
               
            }
        }
        return max==0 ? -1:max;
    }
    public boolean findMax(int num,int[] nums){
        int a=num*-1;
        for(int ans:nums){
            if(ans==a){
                return true;
            }
        }
        return false;
    }
}