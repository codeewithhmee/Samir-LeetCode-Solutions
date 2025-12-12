class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr=new int[intervals.length+1][2];
        //placing by correct order
        int p=0;
        while(p<intervals.length && intervals[p][0]<newInterval[0]){
            arr[p]=intervals[p];
            p++;
        }
        arr[p]=newInterval;
        for(int i=p;i<intervals.length;i++){
            arr[i+1]=intervals[i];
        }
    

         List<int[]> ans = new ArrayList<>(); 
         int s=arr[0][0];
         int e=arr[0][1];
         for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=e){
                e=Math.max(e,arr[i][1]);
            }else{
                ans.add(new int[]{s, e});
                s = arr[i][0];
                e = arr[i][1];
                

            }
            
         }
          ans.add(new int[]{s, e});
        return ans.toArray(new int[ans.size()][]);
    }
}