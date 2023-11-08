import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    int s = N;
	    int cnt = 0;
	    
	    while(true) {
	        N = (N % 10 * 10) + ((N / 10 + N % 10) % 10);
	        cnt++;
	        
	        if(s == N)
	            break;
	    }
		System.out.println(cnt);
	}
}
