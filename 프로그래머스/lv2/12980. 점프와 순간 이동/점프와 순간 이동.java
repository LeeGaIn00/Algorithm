import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(true) {
            if(n == 1) {
                ans++;
                break;
            }
            else if(n % 2 == 0) // 짝수
                n /= 2;
            else { // 홀수
                ans++;
                n = (n-1)/2;
            }
        }
        return ans;
    }
}