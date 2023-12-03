import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());    
        
        int div = S / K;
        int mod = S % K;
        
        long ans = 1;
        for(int i = 0; i < K; i++) {
            if(mod > 0) {
                ans *= (div + 1);
                mod--;
            }
            else
                ans *= div;
        }

	    System.out.println(ans); 
	}
}