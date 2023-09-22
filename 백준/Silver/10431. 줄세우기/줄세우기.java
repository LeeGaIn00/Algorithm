import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;;
	    
	    int p = Integer.parseInt(br.readLine());
	    for(int i = 0; i < p; i++) {
	        st = new StringTokenizer(br.readLine());
	        int n = Integer.parseInt(st.nextToken());
	        int arr[] = new int[20];
	        int cnt = 0;
	        
	        for(int j = 0; j < 20; j++) 
	            arr[j] = Integer.parseInt(st.nextToken());
	            
	        for(int j = 0; j < 20; j++) 
	            for(int k = 0; k < j; k++)
	                if(arr[j] < arr[k]) cnt++;
	        
	        System.out.println(n + " " + cnt);
	        
	    }
		
	}
}
