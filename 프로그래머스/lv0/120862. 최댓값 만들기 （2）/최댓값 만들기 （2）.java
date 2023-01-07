import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n1 = numbers[0] * numbers[1];
        int n2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if(n1 < n2) return n2;
        else return n1;
    }
}