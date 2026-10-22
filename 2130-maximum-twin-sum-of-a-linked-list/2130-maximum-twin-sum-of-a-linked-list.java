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
    public ListNode reverseLL(ListNode current){
        ListNode prev = null;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow =head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p1 = reverseLL(slow);
        ListNode p2 = head;
        int sum =0;
        while(p1 != null && p2 != null){
          int temp = p1.val + p2.val;
          if(temp>sum){
            sum = temp;
            
          }
          p1 = p1.next;
          p2 = p2.next;
        }
    return sum;}
}