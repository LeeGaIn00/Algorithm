class Solution {
    public int solution(long num) {
        int answer = 0;
        while(num != 1 && answer <= 500) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            answer++;
        }
        return answer == 501 ? -1 : answer;
    }
}