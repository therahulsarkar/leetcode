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
    static ListNode reverseLL(ListNode ptr) {
    ListNode pre=null;
    ListNode nex=null;
    while(ptr!=null) {
        nex = ptr.next;
        ptr.next = pre;
        pre=ptr;
        ptr=nex;
    }
    return pre;
}

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head;
    ListNode slow = head;
    ListNode prev = null;

    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        
        ListNode next = slow.next;
        slow.next = prev;
        prev = slow;
        slow = next;
    }

    if (fast != null) {
        // odd number of nodes, move slow to the next node
        slow = slow.next;
    }

    while (prev != null && slow != null) {
        if (prev.val != slow.val) return false;
        prev = prev.next;
        slow = slow.next;
    }

    return true;




        // while(fast.next != null && fast.next.next != null){
        //     slow = slow.next; //Move 1 node at a time
        //     fast = fast.next.next; //Move 2 nodes at a time
        // }

        // ListNode newHead = reverseLL(slow.next);
        // fast = head;
        // slow = newHead;

        // while(slow != null){
        //     if(fast.val != slow.val) return false;
        //     slow = slow.next;
        //     fast = fast.next;
        // }

        // return true;
    }
}