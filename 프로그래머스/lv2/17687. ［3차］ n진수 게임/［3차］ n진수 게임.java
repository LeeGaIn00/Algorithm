class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "";
        
        int idx = 0;
        while(str.length() <= t * m) 
            str += Integer.toString(idx++, n);
        
        for(int i = p - 1; answer.length() < t; i += m) 
            answer += str.substring(i, i + 1);
        
        return answer.toUpperCase();
    }
}