import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringBuilder answer = new StringBuilder();
	    
	    String input = br.readLine();
	    int arr[] = new int[26];
	    
	    for(int i = 0; i < input.length(); i++)
	        arr[input.charAt(i) - 'A']++;
	            
	    int odd = 0;
	    for(int i = 0; i < 26; i++) 
	        if(arr[i] % 2 != 0) odd++;
	    
	    if(odd > 1) answer.append("I'm Sorry Hansoo");
	    else {
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0; i < 26; i++) {
	            for(int j = 0; j < arr[i] / 2; j++)
	                sb.append((char)(i + 'A'));
	        }
	        answer.append(sb);
	        
	        for(int i = 0; i < 26; i++) 
	            if(arr[i] % 2 == 1) 
	                answer.append((char)(i + 'A'));
	       
	       answer.append(sb.reverse());
	    }

	    System.out.println(answer);
	}
}