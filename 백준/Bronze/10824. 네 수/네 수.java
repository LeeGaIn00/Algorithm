import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String arr[] = br.readLine().split(" ");
	    
        long A = Long.parseLong(arr[0] + arr[1]);
        long B = Long.parseLong(arr[2] + arr[3]);
	    
		System.out.println(A + B);
	}
}