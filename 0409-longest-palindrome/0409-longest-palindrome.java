class Solution {
    public int longestPalindrome(String s) {
        int[] freq=new int[123];
        int even=0;
        int odd=0;
        boolean hasodd=false;
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        //find number of odd and even
        for(int n:freq){
            if(n%2==0){
                even+=n;
            }else{
                hasodd=true;
               odd+=n-1;
            }
        }
        if(hasodd)return odd+even+1;
        return odd+even;
        
    }
}