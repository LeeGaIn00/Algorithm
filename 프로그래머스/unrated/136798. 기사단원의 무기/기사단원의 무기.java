class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int arr[] = new int[number + 1];
        
        for(int i = 1; i <= number; i++) 
            arr[i] = count(i);
        
        for(int i = 1; i <= number; i++) 
            answer += arr[i] > limit ? power : arr[i]; 
        
        return answer;
    }
    
    public int count(int n) {
        if(n == 1) return 1;
        
        int cnt = 0;
        
        for(int i = 1; i * i <= n; i++) {
            if(i * i == n) cnt++;
            else if(n % i == 0) cnt += 2;
        }
        
        return cnt;
    }
}