import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String arr[][] = new String[n][2];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        Arrays.sort(arr, (o1, o2) -> {
            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); 
        });
        
        for(int i = 0; i < n; i++) 
            System.out.print(arr[i][0] + " " + arr[i][1] + "\n");
    }
}
