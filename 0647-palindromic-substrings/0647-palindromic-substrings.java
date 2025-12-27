class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String ss=s.substring(i,j+1);
                if(isPalin(ss))ans++;
            }
        }
        return ans;
    }
    public boolean isPalin(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--))return false;
        }
        return true;
    }
}