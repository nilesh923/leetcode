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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
            
        }
        int d = len - n +1;
        ListNode prev = dummy;
        ListNode current = head;
        int l =0;
        while(l<(d-1)){
           prev =  prev.next;
           current =  current.next;
           l++;
        }
        //prev.next  = prev.next.next;
        prev.next = current.next;
    return dummy.next;
    }
}