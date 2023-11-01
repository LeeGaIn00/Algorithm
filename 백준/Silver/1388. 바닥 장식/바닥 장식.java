import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    char arr[][] = new char[n][m];
	    int cnt = 0;
	    
	    for(int i = 0; i < n; i++) {
	        String str = br.readLine();
	        for(int j = 0; j < m; j++) {
	            arr[i][j] = str.charAt(j);
	        }
	    }
	    
	    for(int i = 0; i < n; i++) {
	        int tmp = 0;
	        
	        for(int j = 0; j < m; j++) {
	            if(arr[i][j] == '-')
	                tmp++;
	            else 
	                tmp = 0;
	                
	            if(tmp == 1) 
	                cnt++;
	        }
	    }
	    
	    for(int i = 0; i < m; i++) {
	        int tmp = 0;
	        
	        for(int j = 0; j < n; j++) {
	            if(arr[j][i] == '|')
	                tmp++;
	            else 
	                tmp = 0;
	                
	            if(tmp == 1) 
	                cnt++;
	        }
	    }
	    
	    System.out.println(cnt);
	}
}