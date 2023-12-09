import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    String ans = "";
	    
	    int A = Integer.parseInt(st.nextToken());
	    int B = Integer.parseInt(st.nextToken());
	    
	    if(A == B) ans = "==";
	    else if(A > B) ans = ">";
	    else ans = "<";
	
	    System.out.println(ans); 
	}
}
