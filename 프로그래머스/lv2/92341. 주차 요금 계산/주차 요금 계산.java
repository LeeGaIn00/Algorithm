import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        
        TreeMap<String, Integer> tm = new TreeMap<>();
        for(String record : records) {
            String arr[] = record.split(" ");
            String time[] = arr[0].split(":");
            
            int t = (arr[2].equals("IN") ? -1 : 1) * ((Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]));
            
            tm.put(arr[1], tm.getOrDefault(arr[1], 0) + t);
        }
        
        answer = new int[tm.size()];
        int idx = 0;
        for(String key : tm.keySet()) {
            int time = tm.get(key);
            if(time <= 0) time += 23 * 60 + 59;
    
            double bt = time < fees[0] ? 0 : time - fees[0];
            int price = fees[1] + (int)Math.ceil(bt / fees[2]) * fees[3];
            
            answer[idx++] = price;
        }
		
        return answer;
    }
}