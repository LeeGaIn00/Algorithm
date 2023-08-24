class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int c = 0;
        String str[] = polynomial.replace(" ", "").split("\\+");
        
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("x")) x += 1;
            else if(str[i].contains("x")) 
                x += Integer.parseInt(str[i].substring(0, str[i].length() - 1));
            else 
                c += Integer.parseInt(str[i]);
        }
        if(x != 0 && c != 0) {
            if(x == 1) answer = "x + " + c;
            else answer = x + "x + " + c;
        }
        else if(x == 0 && c != 0) 
               answer = c + "";
        else if(x != 0 && c == 0) {
             if(x == 1) answer = "x";
             else answer = x + "x";
        }
        else 
               answer = "0";
        return answer;
    }
}