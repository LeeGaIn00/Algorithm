class Solution {
    public int[] solution(long n) {
        int cnt = 0;
        long tmp = n;
         while(tmp != 0){
                cnt++;
                tmp /= 10;
        }
        int[] answer = new int[cnt];
        tmp = n;
        for(int i = 0; tmp != 0; i++) {
            answer[i] = (int)(tmp % 10);
            tmp /= 10;
        }
        return answer;
    }
}