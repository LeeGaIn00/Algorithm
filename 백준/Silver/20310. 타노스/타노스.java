import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    String str = br.readLine();
	    char[] arr = str.toCharArray();
	    
	    int cntZero = 0;
	    int cntOne = 0;
	    
	    for(int i = 0; i < arr.length; i++) {
	        char c = arr[i];
	        
	        if(c == '0') cntZero++;
	        else cntOne++;
	    }
	    
	    cntZero /= 2;
	    cntOne /= 2;
	    
	    for(int i = 0; i < str.length() && cntOne != 0; i++) {
	        if(arr[i] == '1') {
	            cntOne--;
	            arr[i] = '-';
	        }
	    }
	    
	    for(int i = str.length() - 1; i >= 0 && cntZero != 0; i--) {
	        if(arr[i] == '0') {
	            cntZero--;
	            arr[i] = '-';
	        }
	    }
	    
	    for(int i = 0; i < str.length(); i++)
	        if(arr[i] != '-')
	            sb.append(arr[i]);
            
		System.out.println(sb);
	}
}