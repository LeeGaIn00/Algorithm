import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        int size = String.valueOf(N).length();
        int start = N - (9 * size);
        for(int i = start; i < N; i++) {
            int sum = i;
            int tmp = i;
            while(tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if(sum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
	}
}
