import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= n) {
                int l = n - array[i - 1];
                int r = array[i] - n;
                return l <= r ? array[i - 1] : array[i];
                
            }
        }
        return array[array.length-1];
    }
}