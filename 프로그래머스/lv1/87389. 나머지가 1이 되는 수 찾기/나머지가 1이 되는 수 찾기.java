class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer++;
            if(n % answer == 1)
                break;
        }
        return answer;
    }
}