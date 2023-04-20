class Solution {
    public String[] solution(String[] names) {
        int n = 0;
        int cnt = 0;
        if(names.length % 5 == 0) n = names.length / 5;
        else n = names.length / 5 + 1;
        String[] answer = new String[n];
        for(int i = 0; i < names.length; i+=5)
            answer[cnt++] = names[i];
        return answer;
    }
}