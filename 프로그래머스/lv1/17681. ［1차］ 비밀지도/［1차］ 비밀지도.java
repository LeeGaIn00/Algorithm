class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Long[][] map1 = new Long[n][n];
        Long[][] map2 = new Long[n][n];
        
        for(int i = 0; i < arr1.length; i++) {
            char[] bin1 = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i]))).toCharArray();
            char[] bin2 = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr2[i]))).toCharArray();
            String temp = "";
            
            for(int j = 0; j < n; j++) {
                if(bin1[j] == '1' || bin2[j] == '1')
                    temp += "#";
                else 
                    temp += " ";
            }
            answer[i] = temp;
        }
        return answer;
    }
}