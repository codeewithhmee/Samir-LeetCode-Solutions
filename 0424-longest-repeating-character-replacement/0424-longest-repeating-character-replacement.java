class Solution {
    public int characterReplacement(String s, int k) {
      int[] freq=new int[26];
      int l=0;
      int fc=0;
      int ans=0;
      for(int r=0;r<s.length();r++){
        freq[s.charAt(r)-'A']++;
        //tack of most freqnted character
        fc=Math.max(fc,freq[s.charAt(r)-'A']);
        int winsize=r-l+1;

        while(r-l+1-fc>k){
            freq[s.charAt(l)-'A']--;
            l++;
        }

        ans=Math.max(ans,r-l+1);
      }
      
      return ans; 
    }
}
