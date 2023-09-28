import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
	    int N = sc.nextInt();
	   
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    
	    while(N-- > 0) {
	        int n = sc.nextInt();
	        max = n > max ? n : max;
	        min = n < min ? n : min;
	       
	    }
	    
	    System.out.println(max * min);
	}
}
