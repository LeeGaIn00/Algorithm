import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                int res = numbers[i] + numbers[j];
                // 리스트에 없으면 추가
                if(!list.contains(res))
                    list.add(res);
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) 
            answer[i] = list.get(i);
        return answer;
    }
}