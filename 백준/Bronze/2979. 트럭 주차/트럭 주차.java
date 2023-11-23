import java.util.*;
import java.io.*;

public class Main
{
    
    static int[] arr;
    static Integer[] dp;
    static int max;
    
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int A = Integer.parseInt(st.nextToken());
	    int B = Integer.parseInt(st.nextToken());
	    int C = Integer.parseInt(st.nextToken());
	    
	    int[] arr = new int[103];
	    int truck[][] = new int[3][2];
	    for(int i = 0; i < 3; i++) {
	        st = new StringTokenizer(br.readLine());
	        for(int j = 0; j < 2; j++)
	            truck[i][j] = Integer.parseInt(st.nextToken());
	    }
	    int cost = 0;
	    for(int i = 1; ; i++) {
	        int cnt = 0;
	        for(int j = 0; j < 3; j++) 
	            if(truck[j][0] <= i && truck[j][1] > i)
	                cnt++;
	                
	        if(cnt == 1) cost += A;
	        else if(cnt == 2) cost += B * 2;
	        else if(cnt == 3) cost += C * 3;
	        
	        if(i > truck[0][1] && i > truck[1][1] && i > truck[2][1])
	            break;
	    }
	    System.out.print(cost);
	}
}
