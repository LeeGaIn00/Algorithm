import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer s;
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < N; i++) {
            s = new StringTokenizer(br.readLine());
            String str = s.nextToken();
            if(str.equals("1")) 
                st.push(Integer.parseInt(s.nextToken()));
            else if(str.equals("2")) {
                if(st.isEmpty()) sb.append(-1).append("\n");
                else sb.append(st.isEmpty() ? -1 : st.pop()).append("\n");
            }
            else if(str.equals("3"))
                sb.append(st.size()).append("\n");
            else if(str.equals("4"))
                sb.append(st.isEmpty() ? 1 : 0).append("\n");
            else if(str.equals("5"))
                sb.append(st.isEmpty() ? -1 : st.peek()).append("\n");
        }
        System.out.println(sb);
    }
}
