import java.util.PriorityQueue;

// class Solution {

//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(k + 1); //Creating a queue of size k+1 to store the elements in min heap

//         for (int i = 0; i < k; i++) {
//             pq.add(nums[i]); //Adding k elements in the priority queue
//         }

//         for (int i = k; i < nums.length; i++) { //Going through the other elements
//             if (pq.peek() < nums[i]) { //If the top elemenet of the pq is smaller than the current element then remove the top element and add the current element
//                 pq.poll();
//                 pq.add(nums[i]);
//             }
//         }

//         return pq.peek(); //Return the top element
//     }
// }

class Solution {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k+1);

        for(int i=0; i<k; i++){
            pq.add(nums[i]);
        }

        for(int i=k; i<nums.length; i++){
            if(pq.peek() < nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }

        return pq.peek();
    }
}