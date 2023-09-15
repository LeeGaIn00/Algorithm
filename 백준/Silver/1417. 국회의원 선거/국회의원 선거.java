import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int arr[] = new int[N - 1];
	    int score = sc.nextInt();
	    int cnt = 0;
	    
	    if(N == 1) {
	        System.out.println(cnt); 
	        return;
	    }
	    
	    for(int i = 0; i < N - 1; i++)
	        arr[i] = sc.nextInt();
	   
	    Arrays.sort(arr);
	    while(arr[N - 2] >= score) {
	        arr[N - 2]--;
	        score++;
	        cnt++;
	        Arrays.sort(arr);
	    }
	    
	    System.out.println(cnt); 
	}
}
