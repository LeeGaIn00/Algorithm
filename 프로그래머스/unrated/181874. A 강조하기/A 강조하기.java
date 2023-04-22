class Solution {
    public String solution(String myString) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if(c == 'a') sb.append('A');
            else if(c > 'A' && c <= 'Z') sb.append((char)(c + 32));
            else sb.append(c);
        }
        return sb.toString();
    }
}