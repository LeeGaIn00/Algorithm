import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i = 1; i <= N; i++) {
            if(i < 100) count++;
            else {
                String[] arr = Integer.toString(i).split("");
                if((Integer.parseInt(arr[1]) - Integer.parseInt(arr[0]))
                    == (Integer.parseInt(arr[2]) - Integer.parseInt(arr[1])))
                    count++;
            }
        }
    
	    System.out.println(count); 
	}
}