import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        ArrayList<Integer> win = new ArrayList<>();
        
        for(int i = 0; i < win_nums.length; i++)
            win.add(win_nums[i]);
        
        int same = 0; // 일치하는 것의 개수
        int zero = 0; // 모르는 번호 개수
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) zero++;
            if(win.contains(lottos[i])) same++;
        }
        
        answer[0] = 7 - (same + zero);
        answer[1] = 7 - same;
        
        if(answer[0] < 1 || answer[0] > 6) answer[0]--;
        if(answer[1] > 6) answer[1] = 6;
        
        return answer;
    }
}