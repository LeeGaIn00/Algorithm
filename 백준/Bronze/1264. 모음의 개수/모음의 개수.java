import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    while(true) {
	        String str = br.readLine();
	        int cnt = 0;
	        
	        if(str.equals("#"))
                break;
               
        
            for(int i = 0; i < str.length(); i++)
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
                    || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
                    cnt++;
    
            
             System.out.println(cnt);
	    }

	}
}