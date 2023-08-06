class Solution {
    public int solution(String s) {
        if(s.startsWith("-")) return Integer.parseInt(s.substring(1)) * -1;
        else return Integer.parseInt(s);
    }
}