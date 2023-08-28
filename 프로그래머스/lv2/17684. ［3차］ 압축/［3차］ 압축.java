import java.util.*;

class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        int idx = 1;
        for(char c = 'A'; c <= 'Z'; c++)
            map.put(c + "", idx++);
        
        for(int i = 0; i < msg.length(); i++) {
            int a = 1;
            
            while(i + a <= msg.length() && map.containsKey(msg.substring(i, i + a))) {
                a++;
            }
            
            // 문자열 끝났을 경우
            if(i + a > msg.length()) {
                list.add(map.get(msg.substring(i)));
                break;
            }
            list.add(map.get(msg.substring(i, i + a - 1)));
            map.put(msg.substring(i, i + a), idx++);
            
            if(a > 1) i += a - 2;
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}