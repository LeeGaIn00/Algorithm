import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        s = s.replaceAll(" ", "").replaceAll("\\{", "").replaceAll("\\}", "");
        String str[] = s.split(",");
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < str.length; i++)
            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
        
        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        answer = new int[keySet.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = Integer.parseInt(keySet.get(i));
        return answer;
    }
}