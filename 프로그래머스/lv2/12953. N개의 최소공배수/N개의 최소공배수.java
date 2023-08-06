class Solution {
    public int solution(int[] arr) {
        if(arr.length == 1) return arr[0];
        int gcd = GCD(arr[0], arr[1]); // 처음 두 원소의 최대 공약수
        int answer = (arr[0] * arr[1]) / gcd;
        
        if(arr.length == 2) return answer;
        else { // 3개 이상
            for(int i = 2; i < arr.length; i++) {
                gcd = GCD(answer, arr[i]);
                answer = (answer * arr[i]) / gcd;
            }
        }
        return answer;
    }
    int GCD(int a, int b) {
        if(a % b == 0) return b;
        return GCD(b, a%b);
    }
}