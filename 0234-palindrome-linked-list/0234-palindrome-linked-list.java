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
    public boolean isPalindrome(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode newListHead = null;
        while(fast!=null && fast.next != null){
            prev = slow;
            slow = slow .next;
            fast = fast.next.next;
            if(newListHead==null){
                newListHead = new ListNode(prev.val);
            }else{
                ListNode node = new ListNode(prev.val);
                node.next = newListHead;
                newListHead = node;
            }
        }
        if(fast != null){//list the odd length skip the middle 
          slow = slow.next;//skip the middle 
        }
        while(slow!= null && newListHead!=null){
        if(slow.val!=newListHead.val){
            return false;
        }
        slow= slow.next;
        newListHead = newListHead.next;
        }
        return true;

    }
}