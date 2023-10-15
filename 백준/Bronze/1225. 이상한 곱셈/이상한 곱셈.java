import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String arr1[] = st.nextToken().split("");
		String arr2[] = st.nextToken().split("");
		long res = 0;
		
		for(int i = 0; i < arr1.length; i++) 
		    for(int j = 0; j < arr2.length; j++)
		        res += Integer.parseInt(arr1[i]) * Integer.parseInt(arr2[j]);
		
		System.out.println(res);
            
	}
}
