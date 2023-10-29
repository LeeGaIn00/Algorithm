import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    ArrayList<String> list = new ArrayList<>();
	    
	    String str = br.readLine();
	    for(int i = 0; i < str.length(); i++)
	        list.add(str.substring(i));
	    
	    Collections.sort(list);
	    for(int i = 0; i < list.size(); i++)
	        System.out.println(list.get(i));
	}
}