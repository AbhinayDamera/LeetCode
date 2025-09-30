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
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         if (head == null) {
//             return null;
//         }
//         ListNode slow = head;
//         ListNode fast = head;
        
//         // Move fast by 2 steps, slow by 1 step
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
        
//         return slow; // when fast reaches end, slow is in the middle
//     }
// }
