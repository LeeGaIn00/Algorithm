class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num > 0 && answer < 500) {
            if(num == 1) return answer;
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            answer++;
        }
        return -1;
    }
}