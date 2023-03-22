import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] temp = new int[numlist.length][2];
        
        for(int i = 0; i < numlist.length; i++) {
            temp[i][0] = Math.abs(numlist[i] - n);
            temp[i][1] = numlist[i];
        }
        
        Arrays.sort(temp, (t1, t2) -> {
            if(t1[0] == t2[0]) return t2[1] - t1[1];
            else return t1[0] - t2[0];
            
        });
        
        for(int i = 0; i < temp.length; i++)
            answer[i] = temp[i][1];
        return answer;
    }
}