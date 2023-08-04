import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    while(str.length() > 0) {
	        if(str.length() < 10) {
	            System.out.println(str);
	            return;
	        }
	        else {
	            System.out.println(str.substring(0, 10));
	            str = str.substring(10);
	        }
	    }
	}
}
