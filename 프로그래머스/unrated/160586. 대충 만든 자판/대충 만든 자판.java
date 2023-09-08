class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] arr = new int[26];
        
        for(int i = 0; i < arr.length; i++) {
            char target = (char)(i + 'A');
            arr[i] = Integer.MAX_VALUE;
            
            for(String key : keymap) {
                int index = key.indexOf(target) + 1;
                if(index != 0)
                    arr[i] = Math.min(arr[i], index);
            }
        }
        
        int idx = 0;
        for(String target : targets) {
            int sum = 0;
            for(int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);
                
                int index = arr[c - 'A'];
                if(index == Integer.MAX_VALUE) {
                    sum = -1;
                    break;
                }
                sum += index;
            }
            answer[idx++] = sum;
        }
        
        return answer;
    }
}