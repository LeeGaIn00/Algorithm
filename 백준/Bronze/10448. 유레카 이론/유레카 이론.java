import java.util.*;
import java.io.*;

public class Main
{
    static int countarr[];
    static int result[];
    
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int T = Integer.parseInt(br.readLine());
	    
	    countarr = new int[T];
	    result = new int[T];
	    
	    for(int i = 0; i < T; i++) {
	        int K = Integer.parseInt(br.readLine());
	        
	        countarr[i] = K;
	    }
	    
	    int arr[] = new int[44];
	    
	    for(int i = 1; i < 44; i++)
	        arr[i] = (i * (i + 1)) / 2;
	        
	    for(int i = 1; i < 44; i++) {
	        for(int j = 1; j < 44; j++) {
	            for(int k = 1; k < 44; k++) {
	                int sum = 0;
	                sum += arr[i] + arr[j] + arr[k];
	                
	                check(sum);
	            }
	        }
	    }
	        
	    for(int i = 0; i < countarr.length; i++)
	        System.out.println(result[i]);
	}
	
	public static void check(int sum) {
	    for(int i = 0; i < countarr.length; i++) {
	        if(result[i] != 1) {
	            if(countarr[i] == sum) result[i] = 1;
	            else result[i] = 0;
	        }
	    }
	}
}