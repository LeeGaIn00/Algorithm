import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		String B = st.nextToken();
		int ans = A.length();
		
		for(int i = 0; i <= B.length() - A.length(); i++) {
		    int cnt = 0;
		    for(int j = 0; j < A.length(); j++)
		        if(A.charAt(j) != B.charAt(i+j))
		            cnt++;
		    ans = Math.min(ans, cnt);
		}
		
		System.out.println(ans);
	}
}
