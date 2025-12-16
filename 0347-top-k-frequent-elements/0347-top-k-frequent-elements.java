class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int n:nums)map.put(n,map.getOrDefault(n,0)+1);
       int[][] freq=new int[map.size()][2];
       int p=0;
       for(int n:map.keySet()){
        freq[p][1]=n;
        freq[p][0]=map.get(n);
        p++;
       }
       Arrays.sort(freq, (a, b) -> Integer.compare(a[0], b[0]));
       int[] ans=new int[k];
       int l=freq.length-1;
       p=0;
      while(k>0){
        ans[p]=freq[l][1];
        p++;
        l--;
        k--;
      }
       return ans;


    }
}