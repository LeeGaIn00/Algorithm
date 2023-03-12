class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", " ");
        
        String[] str = my_string.split(" ");
        
        for(int i = 0; i < str.length; i++)
            if(!str[i].equals(""))
               answer += Integer.parseInt(str[i]);
        return answer;
    }
}