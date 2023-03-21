class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = quiz;
        
        for(int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int a = Integer.parseInt(arr[0]); 
            int b = Integer.parseInt(arr[2]);
            String op = arr[1];
            String res = (op.equals("+") ? a + b : a - b) + "";
            
            if(res.equals(arr[arr.length - 1])) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
    }
}