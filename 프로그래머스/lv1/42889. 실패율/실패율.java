import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        Map<Integer, Double> rank = new HashMap<>();
        Arrays.sort(stages);
        
        for(int i = 1; i <= N; i++) {
            int current = 0;
            int success = 0;
            
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] == i) {
                    current++;
                    success++;
                }
                else if(stages[j] > i) {
                    success += stages.length - j;
                    break;
                }
            }
            
            if(success == 0) rank.put(i, 0.0);
            else rank.put(i, (double)current / success);
        }
        List<Integer> keySet = new ArrayList<>(rank.keySet());
        Collections.sort(keySet, (o1, o2) -> (rank.get(o2).compareTo(rank.get(o1))));
        
        int idx = 0;
        for(int i : keySet)
            answer[idx++] = i;
        
        return answer;
    }
}