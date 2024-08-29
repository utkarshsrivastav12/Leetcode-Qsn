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
        int size=1;
        ListNode temp = head;

        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int counter=1;
        int middle=0;
        if(size%2!=0){
         middle = (size/2)+1;
        }else{
            middle = (size/2);
        }
        temp=head;
        while(counter<middle){
            counter++;
            temp=temp.next;
        }
        return temp;

    }
}