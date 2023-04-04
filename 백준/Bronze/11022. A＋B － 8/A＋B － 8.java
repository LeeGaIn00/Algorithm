import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		int i;
		for(i=1;i<=t;i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			int sum=a+b;
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+sum);
		}
	}
}