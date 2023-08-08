class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char arr[] = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if(ch == ' ') sb.append(" "); // 공백
            else if(ch >= 'A' && ch <= 'Z') 
                sb.append((char) ((ch - 'A' + n) % 26 + 'A'));
            else 
              sb.append((char) ((ch - 'a' + n) % 26 + 'a'));
        }
        return sb.toString();
    }
}