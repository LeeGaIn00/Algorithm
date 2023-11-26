import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    int F = Integer.parseInt(br.readLine());
	    
	    N -= (N % 100);
	    
	    while(true) {
	        if(N % F == 0) break;
	        
	        N++;
	    }
	   
	    System.out.printf("%02d", N % 100);
	}
}
