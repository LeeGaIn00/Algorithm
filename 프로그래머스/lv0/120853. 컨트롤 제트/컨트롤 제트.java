import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        
        // for(int i = 0; i < str.length; i++) {
        //     if(str[i].equals("Z")) answer -= Integer.parseInt(str[i - 1]);
        //     else answer += Integer.parseInt(str[i]);
        // }
        
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < str.length; i++) {
            if(!str[i].equals("Z")) st.push(Integer.parseInt(str[i]));
            else st.pop();
        }
        
        while(st.size() != 0)
            answer += st.pop();
        return answer;
    }
}