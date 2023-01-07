class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < ch.length; i++) 
            if(ch[i] > '0' && ch[i] <= '9') 
                answer += ch[i] - '0';
        
        return answer;
    }
}