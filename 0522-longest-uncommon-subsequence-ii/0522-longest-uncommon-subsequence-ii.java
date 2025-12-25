class Solution {
    public int findLUSlength(String[] strs) {
        int ans=-1;
        for(int i=0;i<strs.length;i++){
            int flag=0;
            for(int j=0;j<strs.length;j++){
                if(i==j)continue;
                if(isSubsequence(strs[i].toCharArray(),strs[j].toCharArray())){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ans=Math.max(ans,strs[i].length());
            }

        }
        return ans;
    }
    public boolean isSubsequence(char[] a,char[] b){
        if(b.length<a.length)return false;
        int p1=0;
        int p2=0;
        while(p2<b.length && p1<a.length){
            if(a[p1]==b[p2]){
                p1++;
            }
            p2++;
        }
        return p1==a.length;
    }
}