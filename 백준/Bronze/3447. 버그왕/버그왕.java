import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = "";
	    String reg = ".*BUG.*";
	    while((str = br.readLine()) != null) {
	        while(str.matches(reg)) {
	            str = str.replaceAll("BUG", "");
	        }
	        System.out.println(str);
	    }
	}
}
