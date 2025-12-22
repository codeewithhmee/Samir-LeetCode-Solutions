class Solution {
    public int countGoodSubstrings(String s) {
        int[] freq=new int[26];
        int l=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'a']++;
            if(r-l+1<3)continue;
            int count=0;
            for(int n:freq){
                if(n==1)count++;
            }
            if(count==3)ans++;
            freq[s.charAt(l)-'a']--;
            l++;
        }
        return ans;
    }
}