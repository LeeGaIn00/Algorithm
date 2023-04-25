import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String[] str = myStr.split("a|b|c");
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < str.length; i++)
            if(!str[i].equals("")) list.add(str[i]);
        if(list.size() == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        else {
            answer = new String[list.size()];
            answer = list.stream().toArray(String[] :: new);
        }
        return answer;
    }
}