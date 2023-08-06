class Solution {
    public int solution(int n) {
        int answer = 0;
        int len1 = Integer.bitCount(n);
        while(true) {
            int len2 = Integer.bitCount(++n);
            if(len1 == len2) return n;
        }
    }
}