class Solution {
    public int solution(String myString, String pat) {
        StringBuffer sb = new StringBuffer();
        String[] str = myString.split("");
        
        for(String s : str) {
            if(s.equals("A")) sb.append("B");
            else sb.append("A");
        }
        if(sb.toString().contains(pat)) return 1;
        else return 0;
    }
}