class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            StringBuilder sb = new StringBuilder();
            sb.append(answer.substring(s, e+1));
            answer = answer.substring(0, s) + sb.reverse() + answer.substring(e+1);
        }
        return answer;
    }
}