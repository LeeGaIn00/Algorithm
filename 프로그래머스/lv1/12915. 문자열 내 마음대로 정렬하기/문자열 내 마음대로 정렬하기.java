import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        // ArrayList<String> list = new ArrayList<>();
        // for(int i = 0; i < strings.length; i++)
        //     list.add(strings[i].charAt(n) + strings[i]);
        // Collections.sort(list);
        // for(int i = 0; i < strings.length; i++)
        //     answer[i] = list.get(i).substring(1);
        
        Arrays.sort(strings); // 기본 오름차순 정렬
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });
        return strings;
    }
}