import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int N = nums.length;
        nums = Arrays.stream(nums).distinct().toArray();
        
        if(N / 2 > nums.length) return nums.length;
        else return N/2;
    }
}