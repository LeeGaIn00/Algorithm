import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		int i,j;
		for(i=1;i<=t;i++) {
			for(j=0;j<t-i;j++) {
				System.out.print(" ");
			}
			for(int k=t-i;k<t;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}