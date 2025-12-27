class Solution {
    public boolean validPalindrome(String s) {
        //remove from left
        int l=0;
        int r=s.length()-1;
        int flag=0;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                flag++;
                if(flag>1)break;
                r--;
                continue;
            }
            r--;
            l++;
        }
        if(flag<=1)return true;
          l=0;
         r=s.length()-1;
         flag=0;
          while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                flag++;
                if(flag>1)break;
                l++;
                continue;
            }
            r--;
            l++;
        }
        if(flag<=1)return true;
        return false;



    }
}