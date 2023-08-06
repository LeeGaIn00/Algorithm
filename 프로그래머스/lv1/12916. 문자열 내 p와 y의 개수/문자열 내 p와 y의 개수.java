class Solution {
    boolean solution(String s) {
        int pcnt = 0, ycnt = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'P' || c == 'p') pcnt++;
            else if(c == 'Y' || c == 'y') ycnt++;
        }
        return (pcnt == ycnt) ? true : false;
    }
}