class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] temp = polynomial.replace(" ", "").split("\\+");
        int[] k = {0, 0};
        
        for(int i = 0; i < temp.length; i++) {
            if(temp[i].contains("x")){
                if(temp[i].equals("x")) k[0] += 1;
                else k[0] += Integer.parseInt(temp[i].replace("x", ""));
            }
            else 
               k[1] += Integer.parseInt(temp[i]);  
        }
        if(k[0] != 0 && k[1] == 0) answer = (k[0] == 1 ? "" : k[0]) + "x";
        else if((k[0] == 0 && k[1] != 0) || (k[0] == 0 && k[1] == 0)) answer = k[1] + "";
        else answer = (k[0] == 1 ? "" : k[0]) + "x + " + k[1];
        
        return answer;
    }
}