import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] >= sizes[i][1]){
                l1.add(sizes[i][0]);
                l2.add(sizes[i][1]);
            }
            else {
                l2.add(sizes[i][0]);
                l1.add(sizes[i][1]);
            }
        }
        return Collections.max(l1) * Collections.max(l2);
    }
}