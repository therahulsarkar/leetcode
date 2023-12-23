/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static ListNode returnNode(ListNode slow, ListNode head){
        ListNode current = head;
        while(current != slow){
            current = current.next;
            slow = slow.next;
            if(current == slow) break;
        }
        return current;
    } 
    public ListNode detectCycle(ListNode head) {
        ListNode fast  = head;
        ListNode slow = head;
   
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;  
            if(fast == slow) return returnNode(slow, head);
        }
        return null;
    }
}