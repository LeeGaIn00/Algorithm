import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        String[] str = my_str.split("");
        Queue<String> que = new LinkedList<String>();
        String temp = "";
        
        for(int i = 0; i < str.length; i++) {
            if(i % n == 0 && i != 0) {
                que.add("/");
                que.add(str[i]);
            }
            else {
                que.add(str[i]);
            }
        }
        while(que.size() != 0)
            temp += que.poll();
       
        answer = temp.split("/");
        return answer;
    }
}