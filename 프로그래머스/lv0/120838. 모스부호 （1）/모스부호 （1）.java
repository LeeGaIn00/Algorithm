import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] str = letter.split(" ");
        Map<Character, String> morse = new HashMap<>();
    
        char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
        String mos[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--","-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " "};

        for(int i = 0; i < mos.length; i++)
            morse.put(alpha[i], mos[i]);
        
        for(int i = 0; i < str.length; i++)
            for(int j = 0; j < mos.length; j++)
                if(str[i].equals(mos[j]))
                    answer += alpha[j];
        
        return answer;
    }
}