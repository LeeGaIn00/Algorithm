class Solution {
    public String solution(String s) {
        String answer = "";
        String str[] = s.split(" ");
        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);
        for(int i = 1; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);
            if(max < n) max = n;
            if(min > n) min = n;
        }
        return min + " " + max;
    }
}