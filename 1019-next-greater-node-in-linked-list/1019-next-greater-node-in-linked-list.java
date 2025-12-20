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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        int[] arr=new int[l];
        temp=head;
        for(int i=0;i<l;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        int[] ans=new int[l];
      
        for(int i=0;i<l;i++){
  System.out.println(arr[i]);
        }
        Stack<Integer> st=new Stack<>();
        for(int i=l-1;i>=0;i--){
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=0;
            }else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;



    }
}