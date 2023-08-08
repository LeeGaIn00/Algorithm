class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String str[] = s.split("");
        int idx = 0;
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals(" ")) idx = 0;
            else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            }
            else {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            sb.append(str[i]);
        }
        return sb.toString();
    }
}