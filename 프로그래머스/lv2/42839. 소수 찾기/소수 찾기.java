import java.util.*;

class Solution {
    
    HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        permutation("", numbers);
        
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            if(isPrime(it.next())) answer++;
        }
        
        return answer;
    }
    
    public void permutation(String pre, String others) {
        if(!pre.equals(""))
            set.add(Integer.parseInt(pre));
        
        for(int i = 0; i < others.length(); i++)
            permutation(pre + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
    }
    
    public boolean isPrime(int n) {
        if(n == 0 || n == 1) return false;
        
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        
        return true;
    }
}