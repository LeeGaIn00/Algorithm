class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int s = Math.min(a, b);
        int e = Math.max(a, b);
        for(int i = s; i <= e; i++)
            answer += i;
        return answer;
    }
}