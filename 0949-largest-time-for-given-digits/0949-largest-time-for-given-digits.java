class Solution {
    int hour=-1,min=-1;
    public String largestTimeFromDigits(int[] arr) {
        permu(arr,0);
        if(hour==-1)return "";
     
         String h=String.valueOf(hour);
         String m=String.valueOf(min);

         if(hour<10){
            h="0"+h;
         }
         if(min<10){
            m="0"+m;
         }

        return h+":"+m;
        

    }
    public void permu(int[] arr,int idx){
          if (idx == arr.length) {
            int h = arr[0] * 10 + arr[1];
            int m = arr[2] * 10 + arr[3];

            if (h < 24 && m < 60) {   
                if (h > hour || (h == hour && m > min)) {
                    hour = h;
                    min = m;
                }
            }
            return;
        }
        for(int i=idx;i<arr.length;i++){
            //swap
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
            permu(arr,idx+1);
            //backtrack
             temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
        }
    }
}