class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        int max=-9999;
      for(int i=0;i<s.length();i++){
        for(int j=s.length()-1;j>=i;j--){
            if(check(s,i,j)) {
                if(j-i>max){
                    max=j-i;
                    ans=s.substring(i,j+1);
                }
            }
        }
      }
      return ans;
    }
    public static boolean check(String s,int l,int r){
       while(l<r){
        if(s.charAt(l)!=s.charAt(r))return false;
        l++;
        r--;
       }
       return true;
    }
}