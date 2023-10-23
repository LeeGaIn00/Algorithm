import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int ans = 0;
	    
	    String str = br.readLine();
	    String word = br.readLine();
	    
	    str = str.replace(word, "-");
            
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == '-')
                ans++;
        
		System.out.println(ans);
	}
}