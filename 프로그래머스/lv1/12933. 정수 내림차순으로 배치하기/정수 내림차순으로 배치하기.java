import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int len = (int)(Math.log10(n)+1);
        long arr[] = new long[len];
        for(int i = 0; i < len; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(arr);
         for(int i = 0; i < len; i++) 
             answer += arr[i] * Math.pow(10, i);
        return answer;
    }
}