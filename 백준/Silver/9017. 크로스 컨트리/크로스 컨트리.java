import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    
	    for(int i = 0; i < T; i++) {
	        int N = Integer.parseInt(br.readLine());
	        int arr[] = new int[N];
	        int count[] = new int[201];
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for(int j = 0; j < N; j++) {
	            arr[j] = Integer.parseInt(st.nextToken());
	            count[arr[j]]++;
	        }
	        
	        ArrayList<Integer>[] list = new ArrayList[201];
			for (int j = 1; j < 201; j++) 
				list[j] = new ArrayList<Integer>();
			
			int score = 1;
			for (int j = 0; j < N ; j++) {
				if(count[arr[j]]<6) continue;
				list[arr[j]].add(score++);
			}
			
			int min = Integer.MAX_VALUE;
			int idx = 1;
			for(int j = 1; j < 201; j++) {
			    if(list[j].size() >= 6) {
			        int sum = 0;
			        for(int k = 0; k < 4; k++)
			            sum += list[j].get(k);
			         
			        if(min > sum) {
			            min = sum;
			            idx = j;
			        }
			        else if(min == sum) {
			            if(list[idx].get(list[idx].size() - 2) > list[j].get(list[j].size() - 2))
			                idx = j;
			        }
			    }
			}
	        
		    System.out.println(idx);
	    }
	}
}
