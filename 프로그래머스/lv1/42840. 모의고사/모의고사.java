import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] count = new int[3];
        int[] arr1 = {1, 2, 3 ,4 ,5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        ArrayList<Integer> rank = new ArrayList<Integer>();
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i % arr1.length]) count[0]++;
            if(answers[i] == arr2[i % arr2.length]) count[1]++;
            if(answers[i] == arr3[i % arr3.length]) count[2]++;
        }
        
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        for(int i = 0; i < 3; i++)
            if(count[i] == max) rank.add(i + 1);
        
        int[] answer = new int[rank.size()];
        for(int i = 0; i < rank.size(); i++)
            if(rank.get(i) != 0) answer[i] = rank.get(i);
        return answer;
    }
}