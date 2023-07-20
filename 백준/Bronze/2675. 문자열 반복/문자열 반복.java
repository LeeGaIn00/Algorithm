import java.util.*;
 
public class Main {
	public static void main(String[] args) {
	    StringBuilder sb;
		Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int i = 0; i < T; i++) {
	        int n = sc.nextInt();
	        String str = sc.next();
	        sb  = new StringBuilder();
	        for(int j = 0; j < str.length(); j++)
	            for(int k = 0; k < n; k++)
	                sb.append(str.charAt(j));
	        System.out.println(sb.toString());
	    }
	}
}