import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i = 666; ; i++) {
            String str = String.valueOf(i);
            if(str.contains("666")) count++;
            if(count == N) {
                System.out.println(i);
                break;
            }
        }
	}
}
