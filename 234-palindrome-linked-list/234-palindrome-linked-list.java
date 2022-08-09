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
        Stack<Integer> st= new Stack<>();
        ListNode h=head;
        while(h!=null)
        {
            st.push(h.val);
            h=h.next;
        }
        while(head!=null)
        {
            if(head.val!=st.pop())
                return false;
            head=head.next;
        }
        return true;
    }
}