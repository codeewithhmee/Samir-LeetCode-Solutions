class Solution {
    public String decodeString(String s) {
        String finalans="";
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c==']'){
                String ans = "";
                while(st.size()>0 && st.peek()!='['){
                    char ch=st.pop();
                    ans=ch+ans;
                }
                if(st.size()>0)st.pop();//removing ']'

                //now we calculate the how many times
                String f="";
                while(st.size()>0 && st.peek()>='0' && st.peek()<='9'){
                    f=st.pop()+f;
                }
                int freq=Integer.parseInt(f);

              
                //now we make a ans how many times
                String str=ans;
                for(int i=0;i<freq-1;i++){
                    ans=ans+str;
                }
                
                for (char ch : ans.toCharArray()) st.push(ch);
                
            }else{
            
                st.push(c);
            }
            
        }
        finalans = "";
        while (!st.isEmpty()) finalans = st.pop() + finalans;

        return finalans;
    }
}