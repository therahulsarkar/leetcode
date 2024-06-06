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

// We'll use priorty queue to solve this.

// if the size of input array is not divisible by the group size that means the array can not be grouped into sub arrays, each of group size, bcz input array of 9 elements can not be divided into sub arrays of 4 element each.

// Create a priority queue and add all the elements there, in priority queue the elements will be stored from smallest to largest [1,2,2,3,3,4,6,7,8]

// Now run a loop till queue goes empty, get the smallest element, which is stored at front of the queue, now we need (groupSize - 1) more elements to form the group, we' ll run a loop from 1 upto the size of group, and try to remove the next consecutive element from the queue, [If our smallest element at present is 1, then we will try to remove 2 and 3 from the queue, assuming our group size is 3, if any one of 2 or 3 is not present in the queue then we will return false as we can not form consecutive elements]