class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        int gcd = GCD(a, b);
        answer[0] = gcd;
        answer[1] = (n * m) / gcd;  
        return answer;
    }
    int GCD(int n, int m) {
        if(n % m == 0) return m; 
        return GCD(m, n % m);
    }
}