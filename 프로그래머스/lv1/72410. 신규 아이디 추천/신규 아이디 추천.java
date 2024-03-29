class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        answer = answer.replaceAll("[.]{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        if(answer.equals("")) answer = "a";
        if(answer.length() > 15)
            answer = answer.substring(0, 15).replaceAll("[.]$", "");
        if(answer.length() < 3) {
            while(answer.length() < 3)
                answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}