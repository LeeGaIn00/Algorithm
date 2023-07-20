class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int cnt = (len % n == 0) ? len/n : len/n + 1;
        String[] answer = new String[cnt];
        for(int i = 0; i < cnt; i++) {
            int lastidx = i*n + n;
            if(i == cnt - 1) answer[i] = my_str.substring(i*n);
            else answer[i] = my_str.substring(i*n, lastidx);
        }
        return answer;
    }
}