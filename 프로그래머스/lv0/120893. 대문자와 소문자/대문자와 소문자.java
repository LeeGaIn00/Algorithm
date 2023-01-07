class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'A' && ch[i] <= 'Z') answer += (char)(ch[i] + 32);
            else answer += (char)(ch[i] - 32);
        }
        return answer;
    }
}