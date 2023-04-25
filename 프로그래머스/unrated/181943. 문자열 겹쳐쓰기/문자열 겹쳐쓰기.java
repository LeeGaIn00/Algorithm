class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuffer sb = new StringBuffer();
        int len = overwrite_string.length();
        sb.append(my_string.substring(0, s)).append(overwrite_string).append(my_string.substring(s + len));
        return sb.toString();
    }
}