class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuffer sb = new StringBuffer();
        int len = my_string.length() / m;
        String[] str = new String[len];
        int idx = 0;
        for(int i = 0; i < len; i++)
            str[idx++] = my_string.substring(i*m,i*m+m);
        for(int i = 0; i < str.length; i++)
            sb.append(str[i].substring(c-1,c));
        return sb.toString();
    }
}