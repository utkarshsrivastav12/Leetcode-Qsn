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
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode nextNode= current.next;
            current.next =prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast =fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode tail = reverseList(middle);
        ListNode temp = head;
        while(tail!=null){
            if(tail.val != temp.val){
                return false;
            }
            tail = tail.next;
            temp = temp.next;
        }
        return true;
    }
}

        
