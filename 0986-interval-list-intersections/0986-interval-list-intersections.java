class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<firstList.length && j<secondList.length){
            //s and e are start and end of fiirstlist
            int s=firstList[i][0];
            int e=firstList[i][1];
            //s1 and e1 are of second list
            int s1=secondList[j][0];
            int e1=secondList[j][1];
            //check if overlap
            if(s1<=e && e1>=s){
                ans.add(new int[]{Math.max(s,s1),Math.min(e,e1)});
            }
              if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
            j++;
            }


        }
           return ans.toArray( new int[ans.size()][]);
    }
}