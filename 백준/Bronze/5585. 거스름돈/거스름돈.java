import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int ans = 0;
	    int arr[] = {500, 100, 50, 10, 5, 1};
	    
	    int cost = Integer.parseInt(br.readLine());
	    cost = 1000 - cost;
	    
	    for(int i = 0; i < 6; i++) {
	        if(cost / arr[i] > 0) {
	            ans += cost / arr[i];
	            cost = cost % arr[i];
	        }
	    }
            
		System.out.println(ans);
	}
}