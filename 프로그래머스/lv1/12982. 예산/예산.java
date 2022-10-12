import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < d.length; i++)
            list.add(d[i]);
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++) {
            total += list.get(i);
            if(total > budget) {
                answer = i;
                break;
            }   
        }
        
        if(total <= budget) answer = list.size();
        
        return answer;
    }
}