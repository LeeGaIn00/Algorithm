import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return 5 * cities.length;
        
        int answer = 0;
        
        Queue<String> q = new LinkedList<>();
        
        for(String city : cities) {
            city = city.toUpperCase();
            if(q.contains(city)) {
                q.remove(city); // 원소 삭제
                q.offer(city); // 맨 뒤에 추가
                answer += 1;
            }
            else {
                if(q.size() == cacheSize)
                    q.poll();
                q.offer(city);
                answer += 5;
            }
        }
        return answer;
    }
}