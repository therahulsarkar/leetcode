class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if(hand.length % groupSize != 0) return false;
        
        PriorityQueue<Integer> prQueue = new PriorityQueue();
        for(int val : hand){
            prQueue.add(val);
        } 
        
        while(!prQueue.isEmpty()){
            int currentSmallest = prQueue.poll();
            for(int i = 1; i<groupSize; i++){
                if(prQueue.remove(currentSmallest+i)) continue;
                else return false;
            }
        }
        return true;       
    }
}