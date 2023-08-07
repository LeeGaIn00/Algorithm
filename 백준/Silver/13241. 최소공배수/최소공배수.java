import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    long A = sc.nextLong();
	    long B = sc.nextLong();
	    System.out.println(A * B / gcd(A, B));
	}
	static long gcd(long n, long m) {
        if(n % m == 0) return m; 
        return gcd(m, n % m);
    }
}
