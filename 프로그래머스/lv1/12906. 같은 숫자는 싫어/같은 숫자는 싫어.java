import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            boolean flag = false;
            if(arr[i] == arr[i-1] && !flag)
                flag = true;
            else list.add(arr[i]);
        }
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);
        return answer;
    }
}