import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<String> st = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            String answer = "";
            String str = br.readLine();
            String[] arr = str.split(" ");
            
            for(int j = 0; j < arr.length; j++)
                st.push(arr[j]);
            for(int j = 0; j < arr.length; j++)
                answer += " " + st.pop();
            System.out.println("Case #" + (i+1) + ":" + answer);
        }
	}

}