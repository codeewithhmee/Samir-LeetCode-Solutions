class Solution {
    public int longestBeautifulSubstring(String word) {
       int l=0;
       int p=word.charAt(0);
       int countVowels = 1; 
       int ans=0;
       for(int r=1;r<word.length();r++){
         int c=word.charAt(r);
            if (c < p) {
                l=r;
                countVowels = (c == 'a') ? 1 : 0;
            } else if (c > p) {
                countVowels++;
            }else{

            }
            if(countVowels==5 ){
                 ans = Math.max(ans, r - l + 1);
            }
            p=c;
       }
       return ans;
    }
}
