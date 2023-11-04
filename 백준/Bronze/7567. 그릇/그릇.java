import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int ans = 0;
		
		for(int i = 1; i < str.length(); i++) {
		    if(str.charAt(i - 1) == str.charAt(i))
		        ans += 5;
		
		    else
		        ans += 10;
		}
		
		System.out.println(ans + 10);
	}
}
