class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        sb.append(phone_number);
        for(int i = 0; i < phone_number.length()-4; i++)
            sb.replace(i, i+1, "*");
        
        answer = sb.toString();
        return answer;
    }
}