import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        for(String r : record) {
            String arr[] = r.split(" ");
            String msg = arr[0];
            
            if(msg.equals("Enter")) // 입장
                map.put(arr[1], arr[2]);
            else if(msg.equals("Change")) // 닉네임 변경
                map.put(arr[1], arr[2]);
        }
        
        for(String r : record) {
            String arr[] = r.split(" ");
            String msg = arr[0];
            String id = arr[1];
            
            if(msg.equals("Enter"))
                list.add(map.get(id) + "님이 들어왔습니다.");
            else if(msg.equals("Leave"))
                list.add(map.get(id) + "님이 나갔습니다.");
        }
        
        answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}