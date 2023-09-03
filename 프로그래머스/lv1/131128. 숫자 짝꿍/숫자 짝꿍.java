class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int arrX[] = new int[10];
        int arrY[] = new int[10];
        
        for(String x : X.split(""))
            arrX[Integer.parseInt(x)]++;
        
        for(String y : Y.split(""))
            arrY[Integer.parseInt(y)]++;
        
        for(int i = 9; i >= 0; i--) {
            while(arrX[i] > 0 && arrY[i] > 0) {
                arrX[i]--;
                arrY[i]--;
                answer.append(i);
            }
        }
        
        if(answer.toString().startsWith("0")) return "0";
        if(answer.toString().equals("")) return "-1";
        
        return answer.toString();
    }
}