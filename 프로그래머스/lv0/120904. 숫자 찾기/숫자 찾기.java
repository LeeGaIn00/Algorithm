class Solution {
    public int solution(int num, int k) {
        String n = String.valueOf(num);
        
        for(int i = 0; i < n.length(); i++)
            if((n.charAt(i) - '0') == k) return i+1;
        
        return -1;
    }
}