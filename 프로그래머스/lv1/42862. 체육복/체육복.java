import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; // 도난당하지 않은 학생 수
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복이 있지만 도난 당한 학생 
        // -> 빌려줄 수 없음
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        // 체육복을 빌릴 수 있는 학생 수
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(reserve[j] - 1 == lost[i] || reserve[j] + 1 == lost[i]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}