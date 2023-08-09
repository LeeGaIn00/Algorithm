class Solution {
    public int solution(int[][] sizes) {
        int tmp[][] = new int[sizes.length][2];
        int maxW = 0, maxH = 0;
        for(int i = 0; i < sizes.length; i++) {
            tmp[i][0] = Math.max(sizes[i][0], sizes[i][1]);
            tmp[i][1] = Math.min(sizes[i][0], sizes[i][1]);
        }
        for(int i = 0; i < tmp.length; i++) {
            maxW = Math.max(maxW, tmp[i][0]);
            maxH = Math.max(maxH, tmp[i][1]);
        }
        return maxW * maxH;
    }
}