import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());        
        ArrayList<Integer> list = new ArrayList<>();
        int[] cnt = new int[N];
        
        for(int i = 0; i < N; i++)
            list.add(Integer.parseInt(br.readLine()));
            
        Collections.sort(list);
        
        for(int i = 0; i < N; i++) {
            for(int j = 1; j < 5; j++) {
                if(!list.contains(list.get(i) + j))
                    cnt[i]++;
            }        
        }
	    
	    Arrays.sort(cnt);
	    System.out.println(cnt[0]);
	}
}