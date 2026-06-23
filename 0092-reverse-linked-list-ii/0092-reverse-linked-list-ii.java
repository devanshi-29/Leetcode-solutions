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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
       ListNode dummy=new ListNode (0);
       dummy.next=head;
       ListNode leftprev=dummy;
       for(int i=1;i<left;i++)
       {
         leftprev=leftprev.next;
       }

       ListNode curr=leftprev.next;
       ListNode prev=null;
       for(int i=left;i<=right;i++)
       {
         ListNode temp=curr.next;
         curr.next=prev;
         prev=curr;
         curr=temp;
       }
        ListNode leftnode = leftprev.next; // original left node, ab tail ban gayi
        leftprev.next = prev;  // reversed part ka head
        leftnode.next = curr;   //tail ko remaining list se jodo

        return dummy.next;
    }
}