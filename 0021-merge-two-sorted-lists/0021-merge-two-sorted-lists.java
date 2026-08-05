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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) 
    {
        ListNode c1=head1;
        ListNode c2=head2;
        ListNode head=new ListNode(100);
        ListNode temp=head;
        while(c1!=null && c2!=null)
        {
           if(c1.val<c2.val){
             ListNode a=new ListNode(c1.val);
             temp.next=a;
             temp=a;
             c1=c1.next;

           }

           else{
             ListNode a=new ListNode(c2.val);
             temp.next=a;
             temp=a;
             c2=c2.next;

           }
        }

        if(c1==null){
            temp.next=c2;
        }

        else{
            temp.next=c1;
        }


        return head.next;
    }
}