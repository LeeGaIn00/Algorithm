import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int X = sc.nextInt();
	    
	    int arr[] = new int[N];
	    for(int i = 0; i < N; i++)
	        arr[i] = sc.nextInt();
	        
	    int sum = 0;
	    int cnt = 1;
	   
	    for(int i = 0; i < X; i++) 
	        sum += arr[i];
	        
	    int max = sum;
        
        for(int i = X; i < N; i++) {
            sum -= arr[i - X];
            sum += arr[i];
            
            if(max < sum) {
                cnt = 1;
                max = sum;
            }
            else if(max == sum) 
                cnt++;
        }
	    
	    if(max == 0) {
	        System.out.println("SAD");
	        return;
	    }
	    
	    System.out.println(max);
	    System.out.println(cnt);
	}
}
