class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        int cnt = 0;
        while(cnt < arr.length) {
            for(int i = 0; i < n; i++)
                answer += arr[cnt];
            cnt++;
        }
        return answer;
    }
}