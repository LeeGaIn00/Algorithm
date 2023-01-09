class Solution {
    public int solution(int n) {
        int i = 1;
        int res = 1;
        
        while(true) {
            res *= i;
            if(res > n) return i-1;
            i++;
        }
    }
}