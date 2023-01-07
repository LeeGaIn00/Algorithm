class Solution {
    public int solution(int n) {
        for(int i = 1; ; i++)
            if((i % n == 0) && (i % 6 == 0)) 
                return i / 6;
    }
}