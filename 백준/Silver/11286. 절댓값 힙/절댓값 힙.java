import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int f_abs = Math.abs(o1);
            int s_abs = Math.abs(o2);
            if(f_abs == s_abs)
                return o1 > o2 ? 1 : -1;
            else
                return f_abs - s_abs;
        });
        for(int i = 0; i < n; i++) {
            int req = Integer.parseInt(bf.readLine());
            if(req == 0) {
                if(queue.isEmpty()) System.out.println("0");
                else System.out.println(queue.poll());
            }
            else
                queue.add(req);
        }
	}
}