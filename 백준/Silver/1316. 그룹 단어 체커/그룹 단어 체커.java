import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    int ans = 0;
	    for(int i = 0; i < n; i++) {
	        String str = br.readLine();
	        boolean al[] = new boolean[26];
	        boolean tmp = true;
	        for(int j = 0; j < str.length(); j++) {
	            char c = str.charAt(j);
	            if(al[c - 'a']) {
	                if(str.charAt(j) != str.charAt(j-1)) {
	                    tmp = false;
	                    break;
	                }
	            }
	            else
	               al[c - 'a'] = true;
	        }
	        if(tmp) ans++;
	    }
	    System.out.println(ans);
	}
}
