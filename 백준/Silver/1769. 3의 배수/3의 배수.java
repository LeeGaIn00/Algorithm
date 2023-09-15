import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String X = sc.next();
	    int cnt = 0;
	    
	    while(true) {
	        int sum = 0;
	        
	        if(X.length() == 1)
	            break;
	            
	        for(int i = 0; i < X.length(); i++) 
	            sum += X.charAt(i) - '0';
	            
	        X = String.valueOf(sum);
	        cnt++;
	    }
	    
	    System.out.println(cnt);
	    if(Integer.parseInt(X) % 3 == 0) System.out.println("YES"); 
	    else System.out.println("NO"); 
	}
}
