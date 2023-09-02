import java.util.*;

public class Main
{
    static int[] check = new int[100001];
    static int N, K;
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    K = sc.nextInt();
	    
        if (N == K) System.out.println(0);
        else bfs(N);
	}
    
    static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        check[n] = 1;
        
        while(!queue.isEmpty()) {
            int now = queue.poll();
            
            for(int i = 0; i < 3; i++) {
                int next;
                
                if(i == 0) next = now - 1;
                else if(i == 1) next = now + 1;
                else next = now * 2;
                
                if(next == K) {
                    System.out.println(check[now]);
                    return;
                }
                
                if(next >= 0 && next < check.length && check[next] == 0) {
                    queue.add(next);
                    check[next] = check[now] + 1;
                }
            }
        }
    }
}
