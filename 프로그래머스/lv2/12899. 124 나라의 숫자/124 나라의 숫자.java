class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            if(n % 3 == 0) {
                sb.append(4);
                n -= 1;
            }
            else if(n % 3 == 1) sb.append(1);
            else if(n % 3 == 2) sb.append(2);
            
            n /= 3;
        }
        
        return sb.reverse().toString();
    }
}