class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        
        for(int m = i; m <= j; m++) 
            str += String.valueOf(m);
            
        for(int m = 0; m < str.length(); m++) 
            if(str.charAt(m) == (char)(k + '0'))
                answer++;
        
        return answer;
    }
}