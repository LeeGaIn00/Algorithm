class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        String str[] = s.split(" ");
        for(int i = 0; i < str.length; i++) 
            System.out.println(str[i]);
        for(int i = 0; i < str.length; i++) {
            if(str[i].length() == 0) 
                sb.append(" ");
            else {
                sb.append(str[i].substring(0, 1).toUpperCase());
                sb.append(str[i].substring(1).toLowerCase());
                sb.append(" ");
            }
        }
        if(s.substring(s.length() - 1).equals(" ")) return sb.toString();
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}