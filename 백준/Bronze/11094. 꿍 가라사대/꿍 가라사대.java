import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    String reg = ".*Simon says.*";
	    for(int i = 0; i < n; i++) {
	       String str = br.readLine();
	       if(str.matches(reg)) {
	            str = str.replaceAll("Simon says", "");
	            System.out.println(str);
	       }
	    }
	}
}
