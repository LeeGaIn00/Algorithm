class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int arr[] = new int[26];
        for(int i = 0; i < 26; i++)
            arr[i] = -1;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(arr[c - 'a'] == -1) answer[i] = -1;
            else answer[i] = i - arr[c - 'a'];
            arr[c - 'a'] = i;
        }
        return answer;
    }
}