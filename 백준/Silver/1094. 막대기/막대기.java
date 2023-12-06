import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int X = Integer.parseInt(br.readLine());
	    int count = 0;
	    int stick = 64;
	    
	    while(X > 0) {
	        if(X < stick)
	           stick /= 2;
	        else {
	            X -= stick;
	            count++;
	        }
	                
	    }
	 
	    System.out.println(count); 
	}
}
