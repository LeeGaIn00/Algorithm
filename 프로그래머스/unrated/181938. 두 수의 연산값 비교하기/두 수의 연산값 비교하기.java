class Solution {
    public int solution(int a, int b) {
        int res = Integer.parseInt(a + "" + b);
        return res >= (2 * a * b) ? res : (2 * a * b);
    }
}