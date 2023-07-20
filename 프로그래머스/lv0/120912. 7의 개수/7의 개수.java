class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < array.length; i++) 
            sb.append(array[i]+"");
        
        String str = sb.toString();
        int len = str.length();
        str = str.replace("7","");
        return len - str.length();
    }
}