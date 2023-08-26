import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        // 모두 대문자로 변환
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        // 배열 생성 
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        
        for(int i = 0; i < str1.length() - 1; i++) {
            String str = str1.substring(i, i + 2);
            if(str.matches("^[a-zA-Z]*$")) 
                list1.add(str);
        }

        for(int i = 0; i < str2.length() - 1; i++) {
            String str = str2.substring(i, i + 2);
            if(str.matches("^[a-zA-Z]*$")) 
                list2.add(str);
        }
        
        // 정렬
        Collections.sort(list1);
        Collections.sort(list2);
        
        // 교집합
        for(String s : list1) {
            if(list2.remove(s)) // 집합1에 집합2 포함되면 삭제 후 교집합에 추가
                intersection.add(s);
            union.add(s);
        }
        
        // 합집합
        for(String s : list2)
            union.add(s);
   
        if(union.size() == 0) return 65536;
        
        answer = (int)((double)intersection.size() / union.size() * 65536); 
        
        return answer;
    }
}