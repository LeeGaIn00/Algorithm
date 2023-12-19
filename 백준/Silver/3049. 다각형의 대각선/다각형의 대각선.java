import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int N = Integer.parseInt(br.readLine());
	    int cnt = 1;
	    
	    for(int i = 0; i < 4; i++)
	        cnt *= N--;
	        
	    System.out.println(cnt/24);
	    
	}
}