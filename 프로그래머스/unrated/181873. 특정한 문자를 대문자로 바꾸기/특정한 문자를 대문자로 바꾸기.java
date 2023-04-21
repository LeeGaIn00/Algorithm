class Solution {
    public String solution(String my_string, String alp) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < my_string.length(); i++) {
            String temp = my_string.substring(i,i+1);
            if(temp.equals(alp))
                sb.append(temp.toUpperCase());
            else 
                sb.append(temp);
        }
        return sb.toString();
    }
}