import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1) return new int[]{-1};
        int min = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < arr.length; i++)
            min = Math.min(min, arr[i]);
        for(int i = 0; i < arr.length; i++)
            if(arr[i] != min) list.add(arr[i]);
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}