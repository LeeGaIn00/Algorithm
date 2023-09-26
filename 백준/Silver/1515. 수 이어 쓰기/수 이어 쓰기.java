import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    String n = sc.next();
	    
	    int idx = 0;
	    int res = 1;
	    
	    while(true) {
	        String num = Integer.toString(res);
	        
	        for(int i = 0; i < num.length(); i++) {
	            if(num.charAt(i) == n.charAt(idx))
	                idx++;
	            if(idx == n.length()) {
	                System.out.println(res);
	                return;
	            }
	        }
	        res++;
	    }
	}
}
