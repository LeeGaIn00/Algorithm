import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0; i < n; i++) {
	        String s[] = sc.next().split(",");
	        System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
	    }
	}
}
