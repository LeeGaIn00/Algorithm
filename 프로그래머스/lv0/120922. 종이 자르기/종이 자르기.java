class Solution {
    public int solution(int M, int N) {
        if(M == 1 && N == 1) return 0;
        else if(M == 1) return N - 1;
        else if(N == 1) return M - 1;
        else return M * N - 1;
    }
}