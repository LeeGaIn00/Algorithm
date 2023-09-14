class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n * (n + 1) / 2];
        int[][] m = new int[n][n];
        
        int x = -1, y = 0;
        int num = 1;
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(i % 3 == 0) // 세로
                    x++;
                else if(i % 3 == 1) // 가로
                    y++;
                else { // 대각선
                    x--;
                    y--;
                }
                m[x][y] = num++;
            }
        }
        
        int idx = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(m[i][j] != 0)
                    answer[idx++] = m[i][j];
        
        return answer;
    }
}