import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] x = new int[10];
        int[] y = new int[10];
        
        for(int i = 0; i < X.length(); i++)
            x[X.charAt(i) - '0']++;
        for(int i = 0; i < Y.length(); i++)
            y[Y.charAt(i) - '0']++;
        
        for(int i = 9; i >= 0; i--) {
            while(x[i] > 0 && y[i] > 0) {
                sb.append(i);
                x[i]--;
                y[i]--;
            }
        }
        if(sb.toString().equals("")) return "-1";
        else if(sb.toString().startsWith("0")) return "0"; 
        return sb.toString();
    }
}