class Solution {
    public int numFriendRequests(int[] ages) {
        int ans = 0;
        Arrays.sort(ages);
        for (int i = 0; i < ages.length; i++) {
            int threshold = ages[i] / 2 + 7;
            for (int j = i - 1; j >= 0; j--) {
                if (ages[j] > threshold && ages[j] <= ages[i]) { 
                    if(ages[i]==ages[j]){
                        ans+=2;
                    }else{
                        ans++;
                    }
                }
            }
        }
   
        return ans;
    }
}