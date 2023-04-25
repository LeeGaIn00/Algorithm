import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
            list.add(arr[i]);
        while((list.size() & (list.size()-1)) != 0)
            list.add(0);
        return list.stream().mapToInt(i->i).toArray();
    }
}