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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>(); 
        
        ListNode p = head; 
        while (p != null) {
            if (set.contains(p)) {
                return true; 
            }
            set.add(p); 
            p = p.next; 
        }
        return false; 
    }
}