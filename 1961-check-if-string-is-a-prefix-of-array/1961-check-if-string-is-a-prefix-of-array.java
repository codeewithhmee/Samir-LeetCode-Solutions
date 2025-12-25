class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int l1=s.length();
        int l2=0;
        for(int i=0;i<words.length;i++){
            l2+=words[i].length();
            if(l2==l1){
                String str="";
                for(int k=0;k<=i;k++){
                    str=str+words[k];
                }
                if(str.equals(s))return true;
                return false;
            }
            if(l2>l1)return false;
            
        }
        return false;
        
    }
}