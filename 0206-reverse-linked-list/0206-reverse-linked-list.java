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
    public ListNode reverseList(ListNode head) {

    //Recurssive Approch
    if(head== null || head.next == null){
        return head;
    }
    //recurssive call
    ListNode last = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return last;








        //Iterative Approach
        // ListNode curr = head;
        // ListNode prev = null;
        // while(curr!=null){
        //     ListNode nextNode = curr.next;
        //     curr.next=prev;
        //     prev = curr;
        //     curr = nextNode;

        // }
        // return prev;
    }
}