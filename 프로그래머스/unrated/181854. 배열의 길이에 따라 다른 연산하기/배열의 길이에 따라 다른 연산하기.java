class Solution {
    public int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 0) // 짝수
            for(int i = 1; i < arr.length; i+=2) 
                arr[i] += n; 
        else
            for(int j = 0; j < arr.length; j+=2) 
                arr[j] += n; 
        return arr;
    }
}