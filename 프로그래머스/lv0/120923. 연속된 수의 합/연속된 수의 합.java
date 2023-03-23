class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total - (num - 1) * num / 2) / num;
        int cnt = 0;
        
        while(cnt < num) 
            answer[cnt++] = start++;
    
        return answer;
    }
}