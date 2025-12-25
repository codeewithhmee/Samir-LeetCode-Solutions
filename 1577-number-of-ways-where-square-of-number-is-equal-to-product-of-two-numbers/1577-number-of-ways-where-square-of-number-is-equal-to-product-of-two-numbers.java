class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        int ans = 0;

        // Type 1
        for (int i = 0; i < nums1.length; i++) {
            long target = (long) nums1[i] * nums1[i];
            HashMap<Long, Integer> map = new HashMap<>();

            for (int j = 0; j < nums2.length; j++) {
                long val = nums2[j];

                if (val != 0 && target % val == 0) {
                    long need = target / val;
                    if (map.containsKey(need)) {
                        ans += map.get(need);
                    }
                }

                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }

        // Type 2
           for (int i = 0; i < nums2.length; i++) {
            long target = (long) nums2[i] * nums2[i];
            HashMap<Long, Integer> map = new HashMap<>();

            for (int j = 0; j < nums1.length; j++) {
                long val = nums1[j];

                if (val != 0 && target % val == 0) {
                    long need = target / val;
                    if (map.containsKey(need)) {
                        ans += map.get(need);
                    }
                }

                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }
       

        return ans;
    }
}
