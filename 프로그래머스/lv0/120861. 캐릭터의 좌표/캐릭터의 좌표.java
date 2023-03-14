import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = board;
        int x = 0, y = 0;
        
        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left") && x > (board[0] / 2) * -1) x -= 1;
            else if(keyinput[i].equals("right") && x < board[0] / 2) x += 1;
            else if(keyinput[i].equals("up") && y < board[1] / 2) y += 1;
            else if(keyinput[i].equals("down") && y > (board[1] / 2) * -1) y -= 1;
        }
        answer[0] = x;
        answer[1] = y;
        
        // if(Math.abs(x) <= board[0] / 2 && Math.abs(y) <= board[1] / 2){
        //     answer[0] = x; 
        //     answer[1] = y; 
        // }
        // else if(Math.abs(x) > board[0] / 2 && Math.abs(y) <= board[1] / 2) {
        //     answer[0] = x < 0 ? (board[0] / 2) * -1 : board[0] / 2;
        //     answer[1] = y;
        // }
        // else if(Math.abs(x) <= board[0] / 2 && Math.abs(y) > board[1] / 2) {
        //     answer[0] = x;
        //     answer[1] = y < 0 ? (board[1] / 2) * -1 : board[1] / 2;
        // }
        // else {
        //     answer[0] = x < 0 ? (board[0] / 2) * -1 : board[0] / 2;
        //     answer[1] = y < 0 ? (board[1] / 2) * -1 : board[1] / 2;
        // }
        return answer;
    }
}