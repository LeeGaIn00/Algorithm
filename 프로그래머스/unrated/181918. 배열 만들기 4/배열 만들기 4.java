import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            if(list.size() == 0) {
                list.add(arr[i]);
                i++;
            }
            if(list.size() != 0 && list.get(list.size()-1) < arr[i]) {
                list.add(arr[i]);
                i++;
            }
            else
                list.remove(list.size()-1);
        }
        return list.stream().mapToInt(j->j).toArray();
    }
}