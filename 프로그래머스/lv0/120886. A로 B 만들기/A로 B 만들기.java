import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] ch1 = before.toCharArray();
        char[] ch2 = after.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        before = new String(ch1);
        after = new String(ch2);
        
        if(before.equals(after)) return 1;
        else return 0;
    }
}