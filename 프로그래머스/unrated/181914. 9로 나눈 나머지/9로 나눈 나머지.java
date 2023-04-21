class Solution {
    public int solution(String number) {
        int n = 0;
        for(int i = 0; i < number.length(); i++)
            n += Integer.parseInt(number.substring(i,i+1));
        return n % 9;
    }
}