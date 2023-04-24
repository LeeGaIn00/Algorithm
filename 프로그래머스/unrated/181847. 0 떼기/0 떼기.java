class Solution {
    public String solution(String n_str) {
        StringBuffer sb = new StringBuffer();
        int flag = 1;
        
        for(int i = 0; i < n_str.length(); i++) {
            if(flag == 1 && n_str.charAt(i) == '0') 
                continue;
            else {
                sb.append(n_str.substring(i));
                break;
            }
        }
        return sb.toString();
    }
}