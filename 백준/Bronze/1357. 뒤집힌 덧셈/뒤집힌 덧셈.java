import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    StringBuilder x = new StringBuilder(st.nextToken());
	    StringBuilder y = new StringBuilder(st.nextToken());
	    x = x.reverse();
	    y = y.reverse();
	    int res = Integer.parseInt(x.toString()) + Integer.parseInt(y.toString());
	    
	    StringBuilder ans = new StringBuilder(String.valueOf(res));
	    System.out.println(Integer.parseInt(ans.reverse().toString()));
	}
}