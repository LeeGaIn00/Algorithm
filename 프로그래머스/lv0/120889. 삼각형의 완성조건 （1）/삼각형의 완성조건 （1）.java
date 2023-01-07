class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        int idx = 0;
        int res = 0;
        
        for(int i = 1; i < 3; i++) {
            if(max < sides[i]) {
                max = sides[i];
                idx = i;
            }
        }
        for(int i = 0; i < 3; i++)
            if(i != idx) res += sides[i];
        if(max < res) return 1;
        else return 2;
    }
}