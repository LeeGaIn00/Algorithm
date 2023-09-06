class Solution {
    public int solution(int[][] dots) {
        
        double a = (double)(dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
        double b = (double)(dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
        
        double c = (double)(dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
        double d = (double)(dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
        
        double e = (double)(dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
        double f = (double)(dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);

        if(a == b || c == d || e == f) return 1;
    
        return 0;
    }
}