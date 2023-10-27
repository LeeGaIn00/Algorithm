import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    HashSet<String> set = new HashSet<>();
	    ArrayList<String> list = new ArrayList<>();
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    
        for(int i = 0; i < N; i++) 
            set.add(br.readLine());
        
        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            if(set.contains(str))
                list.add(str);
        }
        
        Collections.sort(list);
        
        System.out.println(list.size());
        for(String s : list)
            System.out.println(s);
	}
}