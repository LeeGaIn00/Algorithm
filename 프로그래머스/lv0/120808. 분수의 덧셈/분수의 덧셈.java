class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int n = numer1 * denom2 + numer2 * denom1;
        int d = denom1 * denom2;
        
        for(int i = (n < d ? n : d); i > 0 ; i--){
            if(n % i == 0 && d % i == 0) {
                n /= i;
                d /= i;
            }
        }
        answer[0] = n;
        answer[1] = d;
        
        return answer;
    }
}