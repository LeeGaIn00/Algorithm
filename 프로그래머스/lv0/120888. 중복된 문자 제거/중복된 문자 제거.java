import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] ch = my_string.toCharArray();
        String answer = "";
        
        for(int i = 0; i < ch.length; i++) {
           if(!answer.contains(String.valueOf(ch[i])))
               answer += String.valueOf(ch[i]);
        }
        
        return answer;
    }
}