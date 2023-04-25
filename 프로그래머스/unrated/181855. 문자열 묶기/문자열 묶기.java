import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < strArr.length; i++) {
            if(m.get(strArr[i].length()) == null) 
                m.put(strArr[i].length(), 1);
            else 
                m.put(strArr[i].length(), m.get(strArr[i].length())+1);
        }
        return Collections.max(m.values());
    }
}