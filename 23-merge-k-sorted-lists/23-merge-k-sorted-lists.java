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
    public ListNode mergeKLists(ListNode[] lists) {
     Comparator<ListNode> cmp;
        cmp = new Comparator<ListNode>(){
          @Override
            public int compare(ListNode ol1,ListNode ol2)
            {        return ol1.val-ol2.val;}
        };
        
        
    Queue<ListNode> q=new PriorityQueue<ListNode>(cmp);
    for(ListNode ls:lists)
    {
        if(ls!=null) q.add(ls);
    }
     
    ListNode l=new ListNode(0);
    ListNode head=l;
    while(!q.isEmpty())
    {
  head.next=q.poll();
       
        head=head.next;
        ListNode pt=head.next;
        if(pt!=null)
            q.add(pt);
    }
    return l.next;
    }
}