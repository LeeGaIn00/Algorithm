class Solution {
    public String solution(int age) {
        String answer = "";
        String a = Integer.toString(age);
        for(int i = 0; i < a.length(); i++)
            answer += (char)(a.charAt(i) - '0' + 'a');
        return answer;
    }
}