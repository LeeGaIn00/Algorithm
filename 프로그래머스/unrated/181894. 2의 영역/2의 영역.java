class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int first = 0; 
        int last = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == 2) {
                first = i; 
                break;
            }
        for(int i = 0; i < arr.length; i++) 
            if(arr[i] == 2) 
                last = i; 
        if(first == 0 && last == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[last-first+1];
            int idx = 0;
            for(int i = first; i <= last; i++)
                answer[idx++] = arr[i];   
        }
        return answer;
    }
}