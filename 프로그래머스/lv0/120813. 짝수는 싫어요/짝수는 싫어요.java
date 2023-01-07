class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        int j= 0;
        
        for(int i = 1; i <= n; i += 2) {
            answer[j] = i;
            j++;
        }
        return answer;
    }
}