class Solution {
    public int solution(int[] num_list) {
        int res1 = 1;
        int res2 = 0;
        for(int i : num_list) {
            res1 *= i;
            res2 += i;
        }
        return res1 < res2*res2 ? 1 : 0;
    }
}