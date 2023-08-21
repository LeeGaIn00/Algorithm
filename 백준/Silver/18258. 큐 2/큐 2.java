import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")) queue.add(Integer.parseInt(st.nextToken()));
            else if(str.equals("pop")) sb.append(queue.isEmpty() ? -1 : queue.remove()).append("\n");
            else if(str.equals("size")) sb.append(queue.size()).append("\n");
            else if(str.equals("empty")) sb.append(queue.isEmpty() ? 1 : 0).append("\n");
            else if(str.equals("front")) sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
            else if(str.equals("back")) sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
        }
        System.out.println(sb);
    }
}
