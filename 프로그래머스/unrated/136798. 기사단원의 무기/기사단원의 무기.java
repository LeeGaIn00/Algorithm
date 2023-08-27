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
        
        int cnt = 2;
        for(int i = 2; i <= n / 2; i++)
            if(n % i == 0) cnt++;
        
        return cnt;
    }
}