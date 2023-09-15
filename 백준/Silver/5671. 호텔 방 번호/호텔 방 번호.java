import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    while(sc.hasNextInt()) {
	        int N = sc.nextInt();
    	    int M = sc.nextInt();
    	    int cnt = 0;
	    
    	    for(int i = N; i <= M; i++) 
    	        if(check(i)) cnt++;
    	        
    	    System.out.println(cnt);
	    }
	}
	
	static public boolean check(int n) {
	    boolean arr[] = new boolean[10];
	    
	    while(n > 0) {
            if(arr[n % 10]) 
                return false;
            else 
                arr[n % 10] = true;
            n /= 10;
        }
	    
	    return true;
	}
}
