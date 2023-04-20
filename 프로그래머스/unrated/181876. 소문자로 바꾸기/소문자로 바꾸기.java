class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if(c > 64 && c < 91) c += 32;
            answer += c + "";
        }
        return answer;
    }
}