class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int x=n;
        boolean positive=true;
   
        while(n!=0){
            int rem=n%10;
            if(positive){
                sum+=rem;
           
            }else{
                sum-=rem;
            }
            positive=!positive;
            n/=10;

        }

 
        if((int)(Math.log10(x)+1)%2==0)return -sum;
        return sum;

   
  
    }
}