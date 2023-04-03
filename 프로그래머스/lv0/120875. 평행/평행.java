class Solution {
    public int solution(int[][] dots) {
        
        for(int i = 0; i < dots.length; i++) {
            double incl1 = dots[i][0] - dots[(i+1)%4][0] == 0 ? 1 : 
                                        (dots[i][1] - dots[(i+1)%4][1]) / (double)(dots[i][0] - dots[(i+1)%4][0]);
            double incl2 = dots[(i+2)%4][0] - dots[(i+3)%4][0] == 0 ? 1 :
                                        (dots[(i+2)%4][1] - dots[(i+3)%4][1]) / (double)(dots[(i+2)%4][0] - dots[(i+3)%4][0]);
            if(incl1 == incl2) return 1;
        }
            
        return 0;
    }
}