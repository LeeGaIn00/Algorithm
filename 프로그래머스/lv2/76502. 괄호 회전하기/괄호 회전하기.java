import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            Stack<Character> st = new Stack<>();
            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(st.isEmpty()) st.push(c);
                else if(c == ')' && st.peek() == '(') st.pop();
                else if(c == '}' && st.peek() == '{') st.pop();
                else if(c == ']' && st.peek() == '[') st.pop();
                else  st.push(c);
             }
            if(st.isEmpty()) answer++;
            s = s.substring(1) + s.charAt(0); // 회전
        }
        return answer;
    }
}