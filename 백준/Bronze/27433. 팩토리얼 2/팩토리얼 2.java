import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
        System.out.println(f(n));
	}
	static long f(int n) {
	    if(n < 2) return 1;
	    return f(n-1)*n;
	}
}
