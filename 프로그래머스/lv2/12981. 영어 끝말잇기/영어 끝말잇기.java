import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        if(words[0].length() == 1) return answer;
        for(int i = 0; i < words.length; i++) {
            String s = words[i];
            if(list.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            list.add(words[i]);
            if(i > 0 && (s.length() == 1 || 
               words[i-1].charAt(words[i-1].length()-1) != (s.charAt(0)))) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }
        return answer;
    }
}