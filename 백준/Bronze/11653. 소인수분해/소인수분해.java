import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        while(tmp > 1) {
            for(int i = 2; i <= n; i++) {
                if(tmp % i == 0) {
                    System.out.println(i);
                    tmp /= i;
                    break;
                }
            }
        }
	}
}
