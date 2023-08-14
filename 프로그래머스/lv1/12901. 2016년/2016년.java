class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String day[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
        int month[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int d = 5; // 2016.01.01 -> FRI
        for(int i = 0; i < a - 1; i++)
            d += month[i];
        d += b - 1;
        d %= 7;
        return day[d];
    }
}