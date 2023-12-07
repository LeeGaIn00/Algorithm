import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    
	    Queue<Integer> queue = new LinkedList<>();
	    int N = Integer.parseInt(st.nextToken());
	    int K = Integer.parseInt(st.nextToken());
	    
	    for(int i = 1; i <= N; i++)
	        queue.offer(i);
	        
	    sb.append("<");
	    while(queue.size() != 1) {
	        for(int i = 0; i < K - 1; i++)
	            queue.offer(queue.poll());
	            
	        sb.append(queue.poll() + ", ");
	    }
	    
	    sb.append(queue.poll()).append(">");
	    System.out.println(sb); 
	}
}
