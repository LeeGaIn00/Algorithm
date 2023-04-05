import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        LinkedList<String> arr = new LinkedList<>(Arrays.asList(participant));
        
        for(int i = 0; i < completion.length; i++)
            arr.remove(completion[i]);
        answer = arr.get(0);
        return answer;
    }
}