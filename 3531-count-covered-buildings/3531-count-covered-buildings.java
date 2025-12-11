class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        HashMap<Integer, int[]> mapX = new HashMap<>(); 
        HashMap<Integer, int[]> mapY = new HashMap<>(); 

        for (int i = 0; i < buildings.length; i++) {
            int x = buildings[i][0];
            int y = buildings[i][1];

           
            mapX.putIfAbsent(x, new int[]{y, y});
            int[] minMaxY = mapX.get(x);
            minMaxY[0] = Math.min(minMaxY[0], y);
            minMaxY[1] = Math.max(minMaxY[1], y);

           
            mapY.putIfAbsent(y, new int[]{x, x});
            int[] minMaxX = mapY.get(y);
            minMaxX[0] = Math.min(minMaxX[0], x);
            minMaxX[1] = Math.max(minMaxX[1], x);
        }

        int coveredCount = 0;
        for (int i = 0; i < buildings.length; i++) {
            int x = buildings[i][0];
            int y = buildings[i][1];

            int[] minMaxY = mapX.get(x);
            int[] minMaxX = mapY.get(y);

            boolean left = x > minMaxX[0];
            boolean right = x < minMaxX[1];
            boolean down = y > minMaxY[0];
            boolean up = y < minMaxY[1];

            if (left && right && up && down) coveredCount++;
        }

        return coveredCount;
    }
}
