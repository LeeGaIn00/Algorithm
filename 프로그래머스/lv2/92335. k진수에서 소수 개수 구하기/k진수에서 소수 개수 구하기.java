class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String str = Long.toString(n, k);
        String arr[] = str.split("0");
        
        for(int i = 0; i < arr.length; i++)
            if(!arr[i].equals("")) {
                if(isPrime(Long.parseLong(arr[i]))) 
                    answer++;
            }
        
        return answer;
    }
    
    public boolean isPrime(long n) {
        if(n == 1) return false;
        
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) 
                return false;
        
        return true;
    }
}