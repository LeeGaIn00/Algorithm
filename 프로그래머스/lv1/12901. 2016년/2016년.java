class Solution {
    public String solution(int a, int b) {
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dow = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int month = 1; // JAN
        int temp = 5; // FRI
        
        // month
        while(month < a) {
            temp += day[month - 1] % 7;
            month++;
        }
        temp %= 7;
        // day
        temp = (temp + (b - 1) % 7) % 7;
        
        return dow[temp];
    }
}