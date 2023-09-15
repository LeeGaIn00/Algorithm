import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int P = sc.nextInt();
	    StringBuilder sb = new StringBuilder();
	    int cnt = 0;
	    
	    for(int i = 0; i < P; i++) {
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        cnt = 0;
	        
	        int a = 1, b = 1;
	        while(true) {
	            int tmp = (a + b) % M;
	            a = b;
	            b = tmp;
	            cnt++;
	            
	            if(a == 1 && b == 1) {
	                sb.append(N + " " + cnt + "\n");
	                break;
	            }
	        }
	    }
	    System.out.println(sb);
	}
}
