import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    PriorityQueue<Integer> pq = new PriorityQueue<>();
	    
	    int N = sc.nextInt();
	    int in;
	    
	    for(int i = 0; i < N; i++) {
	        in = sc.nextInt();
	        if(in > 0)
	            pq.add(in);
	        else {
	            if(!pq.isEmpty())
	                System.out.println(pq.poll());
	            else 
	                System.out.println(0);
	                
	        }
	    }
	}
}
