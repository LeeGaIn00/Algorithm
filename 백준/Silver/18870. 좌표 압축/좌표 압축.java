import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int sort[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++) 
            arr[i] = sort[i] =  Integer.parseInt(st.nextToken());
        
        Arrays.sort(sort);
        int idx = 0;
        for(int i = 0; i < n; i++)
            if(!map.containsKey(sort[i]))
                map.put(sort[i], idx++);
        
        for(int i = 0; i < n; i++)
			sb.append(map.get(arr[i])+" ");
			
        System.out.print(sb);
    }
}
