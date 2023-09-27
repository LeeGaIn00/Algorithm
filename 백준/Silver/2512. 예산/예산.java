import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int arr[] = new int[N];
	    
	    for(int i = 0; i < N; i++)
	        arr[i] = sc.nextInt();
	        
	    int M = sc.nextInt();
	    
	    Arrays.sort(arr);
	    
	    int sum = 0;
	    for(int i : arr)
	        sum += i;
	        
	    if(sum <= M) {
	        System.out.println(arr[N-1]);
	        return;
	    }
	    
	    int start = 0;
	    int end = M;
	    
	    while(start <= end) {
	        int current = 0;
	        int mid = (start + end) / 2;
	        
	        for(int i = 0; i < N; i++) {
	            if(arr[i] > mid)
	                current += mid;
	            else
	                current += arr[i];
	        }
	        
	        if(current > M)
	            end = mid - 1;
	        else if(current < M)
	            start = mid + 1;
	        else {
	            System.out.println(mid);
	            return;
	        }
	    }
	    
	   System.out.println(end);
	}
}
