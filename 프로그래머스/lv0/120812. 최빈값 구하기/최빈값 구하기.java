class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int check = 0;
        int max = 0;
        int countMax = 0;
        
        for(int i = 0; i < array.length; i++)
            if(max < array[i]) max = array[i];
        
        int[] count = new int[max + 1];
        
        for(int i = 0; i < array.length; i++)
            count[array[i]]++;
        
        for(int i = 0; i < count.length; i++)
            if(countMax < count[i]) {
                countMax = count[i];
                answer = i;   
            }
        
        for(int i = 0; i < count.length; i++) {
            if(countMax == count[i])
                check++;
            if(check > 1) return -1;
        }
        return answer;
    }
}