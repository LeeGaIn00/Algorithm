import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1) {
		    System.out.println(1);
		    return;
		}
		
		int room = 0;
		int cnt = 1;
		
		while(cnt < n) {
		    room++;
		    cnt += room * 6;
		}
		
		System.out.println(room+1);
	}
}
