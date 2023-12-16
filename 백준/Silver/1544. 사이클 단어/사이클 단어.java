import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int N = Integer.parseInt(br.readLine());
	    ArrayList<String>[] list = new ArrayList[N];
	    int cnt = 0;
	    
	    for(int i = 0; i < N; i++) {
	        list[i] = new ArrayList<>();
	        String str = br.readLine();
	        
	        for(int j = 0; j < str.length(); j++)
	            list[i].add(str.substring(j) + str.substring(0, j));
	            
	        boolean check = true;
	        for(int j = 0; check && j < i; j++) {
	            for(int k = 0; check && k < list[j].size(); k++)
	                if(str.equals(list[j].get(k))) check = false;
	        }
	        if(check) cnt++;
	        
	    }
	   
	    System.out.println(cnt); 
	}
}