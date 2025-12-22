class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int[] freqP=new int[26];
        int[] freqS=new int[26];

        for(char c:p.toCharArray()){
            freqP[c-'a']++;
        }
        int l=0;
        for(int r=0;r<s.length();r++){
            //work
            freqS[s.charAt(r)-'a']++;
            int winsize=r-l+1;
            if(winsize<p.length())continue;
            //valid window
            if(isSame(freqP,freqS)){
                ans.add(l);
            }
            //work
            freqS[s.charAt(l)-'a']--;
            l++;
        }
        return ans;

        
    }
    public boolean isSame(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }
}