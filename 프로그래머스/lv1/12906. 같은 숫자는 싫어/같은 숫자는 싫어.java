import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(st.isEmpty()) {
                st.push(arr[i]);
                list.add(arr[i]);
            }
            else
                if(!(st.peek() == arr[i])) { 
                    st.pop();
                    st.push(arr[i]);
                    list.add(arr[i]);
                }
        }
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);
        return answer;
    }
}