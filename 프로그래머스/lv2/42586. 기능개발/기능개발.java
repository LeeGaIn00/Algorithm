import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int works[] = new int[progresses.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            if((100 - progresses[i]) % speeds[i] == 0)
                works[i] = (100 - progresses[i]) / speeds[i];
            else
                works[i] = (100 - progresses[i]) / speeds[i] + 1;
        }
        
        int pre = works[0];
        int cnt = 1;
        for(int i = 1; i < progresses.length; i++) {
            if(pre >= works[i]) cnt++;
            else {
                list.add(cnt);
                cnt = 1;
                pre = works[i];
            }
        }
        list.add(cnt);
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        return answer;
    }
}