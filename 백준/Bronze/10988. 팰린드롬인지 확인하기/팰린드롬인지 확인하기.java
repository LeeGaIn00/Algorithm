import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        if(sb.toString().equals(sb.reverse().toString()))
            System.out.print("1");
        else
            System.out.print("0");
	}
}