class Solution {
    public String solution(String myString) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if(c < 'l') sb.append('l');
            else sb.append(c);
        }
        return sb.toString();
    }
}