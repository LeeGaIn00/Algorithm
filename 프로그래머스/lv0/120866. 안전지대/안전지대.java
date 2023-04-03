class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] newB = new int[board.length][board.length];
        
        // 1X1인 경우
        if(board.length == 1) {
            if(board[0][0] == 1) return 0;
            else return 1;
        }
        
        for(int i= 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1)
                    danger(i, j , newB);
            }
        }
        
        for(int i= 0; i < newB.length; i++) {
             for(int j = 0; j < newB[i].length; j++)
                 if(newB[i][j] == 0) answer++;
        }
        
        return answer;
    }
    
    void danger(int x, int y, int[][] newB) {
        int n = newB.length;
        newB[x][y] = 1;
        
        if(x > 0) newB[x-1][y] = 1;
        if(x < n-1) newB[x+1][y] = 1;
        if(y > 0) newB[x][y-1] = 1;
        if(y < n-1) newB[x][y+1] = 1;
        if(x < n-1 && y < n-1) newB[x+1][y+1] = 1;
        if(x < n-1 && y > 0) newB[x+1][y-1] = 1;
        if(x > 0 && y < n-1) newB[x-1][y+1] =1;
        if(x > 0 && y > 0) newB[x-1][y-1] = 1;
    }
}