class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(!((s.charAt(l)>='a' && s.charAt(l)<='z') || (s.charAt(l)>='0' && s.charAt(l)<='9') )){
                l++;
                continue;
            }
             if(!((s.charAt(r)>='a' && s.charAt(r)<='z') || (s.charAt(r)>='0' && s.charAt(r)<='9') )){
                r--;
                continue;
            }
            if(s.charAt(l++)!=s.charAt(r--))return false;
        }
        return true;
        
    }
}