import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int C = sc.nextInt();
	    int cnt = 0;
	    
	    int time[] = new int[C];
	    int arr[] = new int[N];
	    for(int i = 0; i < N; i++) 
	        arr[i] = sc.nextInt();  
	    
	    for(int i = 1; i <= C; i++) {
	        for(int j = 0; j < N; j++) {
	            if(i % arr[j] == 0) {
	                cnt++;
	                break;
	            }
	        }
	    }
	    
		System.out.println(cnt);
	}
}
