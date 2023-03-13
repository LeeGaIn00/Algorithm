class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int check = 0;
        
        for(int i = 0; i < dic.length; i++) {
            check = 0;
            for(int j = 0; j < spell.length; j++) 
                if(dic[i].indexOf(spell[j]) == -1) { // 문자가 포함되어있지 않으면
                    check = -1;
                    answer = 2;
                    break;
                }
            if(check == 0) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}