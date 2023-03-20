class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') continue;
            else if(arr[i] <= 'z' && arr[i] + n > 'z')
                arr[i] = (char)('a' + (n - ('z' - arr[i])) - 1);
            else if(arr[i] <= 'Z' && arr[i] + n > 'Z')
                arr[i] = (char)('A' + (n - ('Z' - arr[i])) - 1);
            else
                arr[i] = (char)(arr[i] + n);
        }
        return new String(arr);
    }
}