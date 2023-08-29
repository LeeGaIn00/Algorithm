class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int dart[] = new int[3];
        String numStr = "";
        
        int idx = 0;
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if(c >= '0' && c <= '9')  // 숫자 
                numStr += c + "";
            
            else if(c == 'S' || c == 'D' || c == 'T') { // 보너스
                int n = Integer.parseInt(numStr);
                
                if(c == 'S') 
                    dart[idx++] = (int)Math.pow(n, 1);
                else if(c == 'D') 
                    dart[idx++] = (int)Math.pow(n, 2);
                else if(c == 'T') 
                    dart[idx++] = (int)Math.pow(n, 3);
                numStr = "";
            }
            else { // 옵션
                if(c == '*') {
                    dart[idx - 1] *= 2;
                    if(idx - 2 >= 0) dart[idx - 2] *= 2;
                }
                else if(c == '#') {
                    dart[idx - 1] *= -1;
                }
            }
        }
        
        for(int i = 0; i < 3; i++)
            answer += dart[i];
        return answer;
    }
}