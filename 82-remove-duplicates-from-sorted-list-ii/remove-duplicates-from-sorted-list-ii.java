/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev_of_temp = null;
        ListNode nextNode = null;

        while(temp != null && temp.next != null){
            nextNode = temp.next; //Next node will be at the next node of temp (Ahead of temp)
            
            //If value of temp and nextNode are same that means they are duplicate, so just ignore and move nextNode until unique node is encountered
            while(nextNode != null && nextNode.val == temp.val){ 
                nextNode = nextNode.next;
            } //At the end of this while loop temp and nextNode is at distinct node 

            //If there is not duplicate between temp and nextNode, then the next of temp is definitely the nextNode [temp -> nextNode]  
            if(temp.next == nextNode){
                prev_of_temp = temp; //Storing the old temp in prev fo further cases [This will always be behind the temp]
                temp = temp.next; //Move temp to next  
            } else{ //Means there are duplicate between temp and nextNode
                if(prev_of_temp != null){
                    prev_of_temp.next = nextNode; //Prev will directly point to nextNode
                } else{
                    head = nextNode;
                }
                
                temp = nextNode; //Starting temp from the nextNode

            }
        } 
        return head;
    }
}
