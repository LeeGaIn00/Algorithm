import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int cnt[] = {1, 1, 2, 2, 2, 8};
        int ans[] = new int[6];
        for(int i = 0; i < 6; i++) {
            ans[i] = cnt[i] - Integer.parseInt(arr[i]);
        }
        for(int i = 0; i < 6; i++) 
            System.out.print(ans[i] + " ");
	}
}