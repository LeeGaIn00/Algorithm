class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int max = Integer.parseInt(nums[0]);
        int min = Integer.parseInt(nums[1]);
        
        for(int i = 0; i < nums.length; i++) {
            if(max < Integer.parseInt(nums[i])) max = Integer.parseInt(nums[i]);
            if(min > Integer.parseInt(nums[i])) min = Integer.parseInt(nums[i]);
        }
        
        return min + " " + max;
    }
}