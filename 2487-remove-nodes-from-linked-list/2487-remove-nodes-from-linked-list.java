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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        helper(head,st);
        ListNode dummy=new ListNode();
        ListNode h=dummy;
        while(st.size()>0){
            dummy.next=st.pop();
            dummy=dummy.next;
        }
        return h.next;

    }
    public void helper(ListNode head,Stack<ListNode> st){
        if(head==null)return;
        helper(head.next,st);
        if(st.isEmpty() || st.peek().val<=head.val){
            st.push(head);
        }
    }
}