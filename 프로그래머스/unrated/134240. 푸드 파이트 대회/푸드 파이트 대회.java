import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<String> list = new ArrayList<>();
        list.add("0"); // 가운데 물
    
        for(int i = food.length - 1; i > 0; i--) {
            for(int j = 0; j < food[i] / 2; j++) {
                list.add(0, Integer.toString(i));
                list.add(Integer.toString(i));
            }        
        }
        
        for(String i : list)
            answer += i;
        return answer;
    }
}