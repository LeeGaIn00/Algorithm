import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1;  j < prices.length; j++) {
                answer[i]++;
                if(prices[i] > prices[j]) break; 
            }
        }
//         Stack<Integer> st = new Stack<>();
        
//         for(int i = 0; i < prices.length; i++) {
//             // 가격 떨어졌다면
//             while(!st.isEmpty() && prices[st.peek()] > prices[i]) {
//                 answer[st.peek()] = i - st.peek();
//                 st.pop();
//             }
//             st.push(i);    
//         }
        
//         while(!st.isEmpty()) {
//             answer[st.peek()] = prices.length - st.peek() - 1;
//             st.pop();
//         }
        
        return answer;
    }
}