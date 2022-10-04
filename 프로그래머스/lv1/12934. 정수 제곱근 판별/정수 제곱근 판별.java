class Solution {
    public long solution(long n) {
        long answer = 0;
        if(Math.sqrt(n) % 1 == 0)
            return (long)((Math.sqrt(n)+1) * (Math.sqrt(n)+1));
        else 
            return -1;
    }
}