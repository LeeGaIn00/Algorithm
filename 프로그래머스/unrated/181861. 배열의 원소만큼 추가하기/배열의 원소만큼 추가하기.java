class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for(int i : arr) len += i;
        int[] answer = new int[len];
        int idx = 0;
        
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i]; j++)
                answer[idx++] = arr[i]; 
        return answer;
    }
}