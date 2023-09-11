class Solution {
    public int solution(int n) {
        int dp[] = new int[n + 1];
        
        if(n == 1 || n == 2) return 2;
        if(n == 3) return 3;
        
        dp[1] = 2;
        dp[2] = 2;
        dp[3] = 3;
        
        for(int i = 4; i <= n; i++)
            dp[i] = (dp[i-2] + dp[i-1]) % 1000000007;
        
        return dp[n];
    }
    
}