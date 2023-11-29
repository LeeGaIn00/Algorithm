import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int[] arr = new int[5];
	    for(int i = 0; i < 5; i++)
	        arr[i] = Integer.parseInt(st.nextToken());
	   
	    Arrays.sort(arr);
	    int min = arr[0];
	    int count = 0;
	    
	    while(true) {
	        for(int i = 0; i < 5; i++)
	            if(min % arr[i] == 0)
	                count++;
	                
	        if(count >= 3) {
	            System.out.println(min);
	            return;
	        }
	        count = 0;
	        min++;
	    }
	        
	    
	}
}
