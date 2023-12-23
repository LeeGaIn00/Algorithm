import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int Kim = Integer.parseInt(st.nextToken());
        int Lim = Integer.parseInt(st.nextToken());
	    int cnt = 0;
	    
	    while(Kim != Lim) {
	        Kim = Kim / 2 + Kim % 2;
	        Lim = Lim / 2 + Lim % 2;
	        cnt++;
	    }

	    System.out.println(cnt);

	}
}