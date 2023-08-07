class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++)
            answer +=  (count(i) % 2 == 0) ? i * 1 : i * -1;
        return answer;
    }
    int count(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++)
            if(n % i == 0) cnt++;
        return cnt;
    }
}