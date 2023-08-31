class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String arr[] = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < 4; j++) 
                if(!babbling[i].contains(arr[j] + arr[j])) 
                    babbling[i] = babbling[i].replace(arr[j], " ");
            
            babbling[i] = babbling[i].replace(" ", "");
            
            if(babbling[i].length() == 0) answer++;
        }
        
        return answer;
    }
}