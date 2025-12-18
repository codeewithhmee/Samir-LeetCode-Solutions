class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(st.size()>0 && (st.peek()==(char)(c+32) || st.peek()==(char)(c-32)   )){
            st.pop();
        }else{
            st.push(c);
        }
       
      
       }
        String ans="";
        while(st.size()>0)ans=st.pop()+ans;
        return ans;
    }
}