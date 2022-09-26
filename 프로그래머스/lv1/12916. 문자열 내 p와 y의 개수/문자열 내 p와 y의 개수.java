class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcnt = 0; int ycnt = 0;
        String[] str = s.split("");
        
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("P") || str[i].equals("p"))
                pcnt++;
            else if(str[i].equals("Y") || str[i].equals("y"))
                ycnt++;
        }
        if(pcnt != ycnt) answer = false;
        return answer;
    }
}