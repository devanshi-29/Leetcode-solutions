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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(head == null || k == 1)
            return head;
       ListNode dummy=new ListNode(0);
        dummy.next=head;
     
        ListNode groupprev = dummy; //pehle group ka 1 element
        while (true)
        {
           ListNode kth=groupprev;
           for(int i=0;i<k && kth != null;i++)
           {
             kth=kth.next;
           }
           if(kth == null)
                break;
           
           ListNode groupnext=kth.next;// agle grp ka pehla element
           // reverse current group
            ListNode prev = groupnext;
            ListNode curr = groupprev.next;

            while(curr != groupnext)
            {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

             // reconnect
            ListNode temp = groupprev.next; // old head, ab tail ban gaya

            groupprev.next = kth;
            groupprev = temp;

        }

        return dummy.next;
    }
}