class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String finalString="";
        int ans=0;
        char[] b=s.toCharArray();
        for(int i=0;i<dictionary.size();i++){
            if(isSubsequence(dictionary.get(i).toCharArray(),b)){
               if(dictionary.get(i).length()>ans){
                ans=dictionary.get(i).length();
                finalString=dictionary.get(i);
               }else if(dictionary.get(i).length()==ans){
                finalString=(finalString.compareTo(dictionary.get(i))<0)?finalString:dictionary.get(i);
               }
            }
        }
        return finalString;
    }
    public boolean isSubsequence(char[] a,char[] b){//this function checks if there is a subsequence in b which is equal to char[]a
        if(b.length<a.length)return false;
        int p1=0;
        int p2=0;
        while(p1<a.length && p2<b.length){
            if(a[p1]==b[p2]){
                p1++;
            }
            p2++;
        }
        return p1==a.length;
    }
}