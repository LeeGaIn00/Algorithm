class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String temp = ineq + eq;
        if(temp.equals(">=")) return n >= m ? 1 : 0;
        else if(temp.equals("<=")) return n <= m ? 1 : 0;
        else if(temp.equals(">!")) return n > m ? 1 : 0;
        else return n < m ? 1 : 0;
    }
}