import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        return String.valueOf(A.add(B));
    }
}