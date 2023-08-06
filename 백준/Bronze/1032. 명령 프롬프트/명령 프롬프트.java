import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    String str[] = new String[n];
	    boolean c = true;
	    for(int i = 0; i < n; i++) 
	        str[i] = br.readLine();
	    for(int i = 0; i < str[0].length(); i++) {
	        c = true;
	        for(int j = 1; j < n; j++) {
	            if(str[j].charAt(i) != str[j-1].charAt(i)) {
	                System.out.print("?");
	                c = false;
	                break;
	            }
	        }
	        if(c) System.out.print(str[0].charAt(i));
	    }
    }
}
