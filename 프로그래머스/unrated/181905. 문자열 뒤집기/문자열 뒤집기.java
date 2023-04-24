class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer sf = new StringBuffer();
        StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));
        for(int i = 0; i < s; i++)
            sf.append(my_string.substring(i, i+1));
        sf.append(sb.reverse().toString());
        for(int i = e+1; i < my_string.length(); i++)
            sf.append(my_string.substring(i, i+1));
        return sf.toString();
    }
}