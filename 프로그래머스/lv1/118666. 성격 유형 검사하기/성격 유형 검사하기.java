import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> m = new HashMap<>();
        
        for(int i = 0; i < survey.length; i++) {
            if(choices[i] < 4 && choices[i] > 0) { 
                String s = survey[i].substring(0,1);
                m.put(s, m.getOrDefault(s, 0) + 4 - choices[i]);
            }
            else if(choices[i] > 4) {
                String s = survey[i].substring(1);
                m.put(s, m.getOrDefault(s, 0) + choices[i] - 4);
            }
        }
       
        answer += m.getOrDefault("R", 0) >= m.getOrDefault("T", 0) ? "R" : "T";
        answer += m.getOrDefault("C", 0) >= m.getOrDefault("F", 0) ? "C" : "F";
        answer += m.getOrDefault("J", 0) >= m.getOrDefault("M", 0) ? "J" : "M";
        answer += m.getOrDefault("A", 0) >= m.getOrDefault("N", 0) ? "A" : "N";
        
        return answer;
    }
}