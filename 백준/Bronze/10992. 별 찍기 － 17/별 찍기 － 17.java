import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
           
        for(int i = 1; i <= n - 1; i++) {
           for(int j = 1; j <= n - i; j++)
               System.out.print(" ");
            for(int k = 1; k <= 2 * i - 1; k++) {
                if(k == 1 || k == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        // 마지막 줄
        for(int i = 1; i <= 2 * n - 1; i++)
            System.out.print("*");
	}
}