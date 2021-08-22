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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode(0); 
        sentinel.next = head; 
        
        // get length of LL 
        ListNode p1 = head; 
        int length = 0; 
        while (p1 != null) {
            length++; 
            p1 = p1.next; 
        }
        
        int forward = length - n; 
        p1 = sentinel; //covers if n = l
        while (forward > 0) {
            forward--; 
            p1 = p1.next; 
        }
        p1.next = p1.next.next; 
        
        return sentinel.next; 
    }
}