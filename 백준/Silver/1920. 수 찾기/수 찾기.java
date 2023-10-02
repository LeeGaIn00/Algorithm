import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    int arr1[] = new int[N];
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for(int i = 0; i < N; i++)
	        arr1[i] = Integer.parseInt(st.nextToken());
	        
	    int M = Integer.parseInt(br.readLine());
	    int arr2[] = new int[M];
	    st = new StringTokenizer(br.readLine());
	    for(int i = 0; i < M; i++)
	        arr2[i] = Integer.parseInt(st.nextToken());
	        
	    Arrays.sort(arr1);
	    
	    for(int n : arr2) {
            int low = 0;
            int high = N - 1;
            boolean flag = false;
            
            while(low <= high) {
                int mid = (low + high) / 2;
                
                if(n > arr1[mid])
                    low = mid + 1;
                else if(n < arr1[mid])
                    high = mid - 1;
                else {
                    System.out.println(1);
                    flag = true;
                    break;
                }
            }
	        if(!flag) System.out.println(0);
	    }
	}
}
