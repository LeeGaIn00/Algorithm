import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] list = my_string.toCharArray();
        list[num1] = my_string.charAt(num2);
        list[num2] = my_string.charAt(num1);
        
        for(char c : list)
            answer += c;
        
        return answer;
    }
}