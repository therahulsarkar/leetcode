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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode;
        int sum =0, carry = 0, data =0;

        while(l1 != null || l2 != null || carry != 0){
            sum = 0;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;

            if(sum > 9){
                carry = 1;
                data = sum % 10;
            } else{
                carry = 0;
                data = sum;
            }

            ListNode newNode = new ListNode(data);
            temp.next = newNode;
            temp = temp.next;

        }
        return dummyNode.next;
    }
}