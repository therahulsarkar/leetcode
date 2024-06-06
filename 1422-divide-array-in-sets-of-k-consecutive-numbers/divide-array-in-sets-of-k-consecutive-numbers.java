class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
         if(nums.length % k != 0) return false;
        
        PriorityQueue<Integer> prQueue = new PriorityQueue();
        for(int val : nums){
            prQueue.add(val);
        } 
        
        while(!prQueue.isEmpty()){
            int currentSmallest = prQueue.poll();
            for(int i = 1; i<k; i++){
                if(prQueue.remove(currentSmallest+i)) continue;
                else return false;
            }
        }
        return true;       
    }
}