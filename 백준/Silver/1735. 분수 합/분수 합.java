import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    a = a * d + c * b;
	    c = b * d;
	    int gcd = gcd(a, c);
	    System.out.println(a/gcd + " " + c/gcd);
	}
	static int gcd(int n, int m) {
        if(n % m == 0) return m; 
        return gcd(m, n % m);
    }
}
