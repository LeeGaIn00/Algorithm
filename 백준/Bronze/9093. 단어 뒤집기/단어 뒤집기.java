import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            StringBuilder ans = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder(st.nextToken());
                ans.append(sb.reverse() + " ");
            }
            System.out.println(ans);
        }
	}
}
