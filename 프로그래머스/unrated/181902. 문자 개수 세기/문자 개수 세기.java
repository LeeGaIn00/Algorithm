class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= 'A' && c <= 'Z') answer[c-65]++;
            else answer[c-71]++;
        }
        return answer;
    }
}