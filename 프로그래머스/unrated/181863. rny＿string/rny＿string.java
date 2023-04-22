class Solution {
    public String solution(String rny_string) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < rny_string.length(); i++) {
            if(rny_string.substring(i,i+1).equals("m")) sb.append("rn"); 
            else sb.append(rny_string.substring(i,i+1));
        }
        return sb.toString();
    }
}