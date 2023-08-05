class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0, cnt_zero = 0;
        while(s.length() > 1) {
            int len = s.length();
            s = s.replaceAll("0", "");
            cnt++;
            cnt_zero += (len - s.length());
            s = Integer.toBinaryString(s.length());
        }
        answer[0] = cnt;
        answer[1] = cnt_zero;
        return answer;
    }
}