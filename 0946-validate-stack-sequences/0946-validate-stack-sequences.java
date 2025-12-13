class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int p1=0;
        int p2=0;
        Stack<Integer> st=new Stack<>();
        while(p1<pushed.length && p2<popped.length){
            st.push(pushed[p1]);
            while(st.size() >0 && st.peek()==popped[p2]){
                st.pop();
                p2++;
            }
           
            p1++;

        }
      
       return st.isEmpty();
    }
}