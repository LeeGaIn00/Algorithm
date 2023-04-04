class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        arr[0] = 1;
        
        for(int i = 1; i < number; i++)
            arr[i] = divisor(i+1);
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > limit) answer += power;
            else answer += arr[i];
        }
        return answer;
    }
    // 약수의 개수
    int divisor(int n) {
        int cnt = 0;
        for(int i = 1; i * i <= n; i++) {
            if(i * i == n) cnt++;
            else if(n % i == 0) cnt += 2;
        }
        return cnt;
    }
}