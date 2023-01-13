class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < 10; i++)
            numbers = numbers.replace(str[i], i+"");
        
        return Long.parseLong(numbers);
    }
}