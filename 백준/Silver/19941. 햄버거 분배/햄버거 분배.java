import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int K = sc.nextInt();
	    int answer = 0;
	    
	    char arr[] = sc.next().toCharArray();
	    boolean ate[] = new boolean[N];
	    
	    for(int i = 0; i < N; i++) {
	        if(arr[i] == 'P') {
	            int startIdx = Math.max(i-K, 0);
	            int endIdx = Math.min(i+K, N-1);
	            
	            for(int j = startIdx; j <= endIdx; j++) {
	                if(arr[j] == 'H' && !ate[j]) {
	                    ate[j] = true;
	                    answer++;
	                    break;
	                }
	            }
	        }
	    }
	    
	   System.out.println(answer);
	}
}
