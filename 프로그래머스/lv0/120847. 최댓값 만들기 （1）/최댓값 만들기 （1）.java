import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++)
            list.add(numbers[i]);
        Collections.sort(list);
        
        return list.get(list.size()-1) * list.get(list.size()-2);
    }
}