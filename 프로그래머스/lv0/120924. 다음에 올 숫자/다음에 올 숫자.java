class Solution {
    public int solution(int[] common) {
        // 등차 
        if(2 * common[1] == common[0] + common[2])
            return common[common.length - 1] + (common[1] - common[0]);
        // 등비
        else 
            return common[common.length - 1] * (common[1] / common[0]);
    }
}