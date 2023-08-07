import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    System.out.println(A * B / gcd(A, B));
		}
	}
	static int gcd(int n, int m) {
        if(n % m == 0) return m; 
        return gcd(m, n % m);
    }
}
