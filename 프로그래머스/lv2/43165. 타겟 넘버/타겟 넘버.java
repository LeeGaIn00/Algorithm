class Solution {
    
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(0, 0, target, numbers);
        
        return answer;
    }
    
    public void dfs(int depth, int res, int target, int[] numbers) {
        if(depth == numbers.length) {
            if(res == target) 
                answer++;
            return;
        }
        
        int plus = res + numbers[depth];
        int minus = res - numbers[depth];

        dfs(depth + 1, plus, target, numbers);
        dfs(depth + 1, minus, target, numbers);      
    }
}