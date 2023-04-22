class Solution {
    public int solution(int n, String control) {
        for(int i = 0; i < control.length(); i++) {
            String temp = control.substring(i,i+1);
            if(temp.equals("w")) n++;
            else if(temp.equals("s")) n--;
            else if(temp.equals("d")) n += 10;
            else n -= 10;
        }
        return n;
    }
}