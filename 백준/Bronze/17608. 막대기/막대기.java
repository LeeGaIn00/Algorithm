import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            st.push(num);
        }
        int temp = st.pop();
        while(!st.isEmpty()) {
            int t = st.pop();
            if(t > temp) {
                temp = t;
                count++;
            }
        }
        System.out.println(count);
    }
}