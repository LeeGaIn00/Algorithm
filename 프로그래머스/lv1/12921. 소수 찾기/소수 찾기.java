class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean prime[] = new boolean[n + 1];
        prime[0] = prime[1] = true;
        for(int i = 2; i <= n; i++)
            prime[i] = true;
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(prime[i]) {
                for(int j = i; i*j <= n; j++)
                    prime[i*j] = false;
            }
        }
        for(int i = 2; i <= n; i++)
            if(prime[i]) answer++;
        return answer;
    }
}