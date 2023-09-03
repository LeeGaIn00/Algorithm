class Solution {
    public int solution(String s) {
        int answer = 0;
        char c = s.charAt(0);
        int x = 0;
        int diff = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(x == diff) {
                c = s.charAt(i);
                answer++;
            }
            if(s.charAt(i) == c) x++;
            else diff++;
        }
        return answer;
    }
}