import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 1;
        
        answer = dots[0][0] - dots[1][0] == 0 ? answer * Math.abs(dots[0][0] - dots[2][0]) 
                                                : answer * Math.abs(dots[0][0] - dots[1][0]);
        answer = dots[0][1] - dots[1][1] == 0 ? answer * Math.abs(dots[0][1] - dots[2][1]) 
                                                : answer * Math.abs(dots[0][1] - dots[1][1]);

        return answer;
    }
}