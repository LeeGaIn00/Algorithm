import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int res = 0;
        
        long[] N = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            N[i] = Long.parseLong(st.nextToken());
        Arrays.sort(N);
        
        for(int i = 0; i < n; i++) {
            long find = N[i];
            int s = 0;
            int e = n - 1;
            while(s < e) {
                if(N[s] + N[e] == find) {
                    if(i != s && i != e){
                        res++;
                        break;
                    }
                    else if(s == i)
                        s++;
                    else if(e == i)
                        e--;
                }
                else if(N[s] + N[e] < find)
                    s++;
                else 
                    e--;
            }
        }
        System.out.println(res);
	}
}