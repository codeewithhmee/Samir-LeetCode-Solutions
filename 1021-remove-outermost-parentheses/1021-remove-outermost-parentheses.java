class Solution {
    public String removeOuterParentheses(String s) {
    //     Stack<Integer> stint=new Stack<>();//here i store index of not to add bracket
    //     Stack<Character> stchar=new Stack<>();
    //     for(int i=0;i<s.length();i++){
    //         char c=s.charAt(i);
    //         if(c=='('){
    //             stchar.push('(');
    //             stint.push(i);
    //         }else{
    //             if(stchar.size()>1){
    //                 stchar.pop();
    //                 stint.pop();
    //             }else{
    //                 stint.push(i);
    //                 stchar.pop();
    //             }
    //         }
    //     }
    //     //
    //     String ans="";
    //     HashSet<Integer> set=new HashSet<>();
    //     while(stint.size()>0){
    //         set.add(stint.pop());
    //     }
    //   for(int i=0;i<s.length();i++){
    //     if(!set.contains(i)){
    //         ans=ans+s.charAt(i);
    //     }
    //   }
    //   return ans;
    int depth=0;
    StringBuilder sb = new StringBuilder();
    for(char c:s.toCharArray()){
        if(c=='('){
            depth++;
            if(depth>1)sb.append('(');
        }else{
            if(depth>1)sb.append(')');
            depth--;
        }

    }
      return sb.toString();
    }
}