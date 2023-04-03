import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] fail = new double[N];
        Map<Integer, Double> m = new HashMap<>();
        
        for(int i = 0; i < N; i++) {
            int count = 0; // 도전자 수
            int num = 0; // 실패한 사람 수
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] >= i+1) count++;
                if(stages[j] == i+1) num++;
            }
            if(count == 0) fail[i] = 0;
            else fail[i] = num / (double)count;
        }
        
        for(int i = 0; i < fail.length; i++) 
            m.put(i+1, fail[i]);
    
        List<Integer> keyList = new ArrayList<>(m.keySet());
        keyList.sort((o1, o2) -> m.get(o2).compareTo(m.get(o1)));
        
        int i = 0;
        for (int key : keyList) 
            answer[i++] = key;
        
        return answer;
    }
}