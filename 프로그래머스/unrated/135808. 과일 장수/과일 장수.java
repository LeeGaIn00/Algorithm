import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i = 0; i < arr.length; i += m)
            if(i+m-1 < arr.length) answer += arr[i+m-1] * m;
        return answer;
    }
}