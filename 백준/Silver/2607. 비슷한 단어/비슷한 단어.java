import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int result = 0;
	    
	    int N = Integer.parseInt(br.readLine());
	    String word = br.readLine();
	    
	    for(int i = 0; i < N - 1; i++) {
	        String str = br.readLine();
	        int cnt = 0;
	        int arr[] = new int[26];
	        
	        for(int j = 0; j < word.length(); j++) 
	            arr[word.charAt(j) - 'A']++;
	     
	        for(int j = 0; j < str.length(); j++) {
	            if(arr[str.charAt(j) - 'A'] > 0) {
	                cnt++;
	                arr[str.charAt(j) - 'A']--;
	            }
	        }
	        
	        // 비교 문자열이 같거나 한문자만 바뀐 경우
	        if(word.length() == str.length() && (word.length() == cnt || word.length() - 1 == cnt))
	            result++;
	        else if(word.length() == str.length() - 1 && str.length() - 1 == cnt)
	            result++;
	        else if(word.length() == str.length() + 1 && str.length() == cnt)
	            result++;
	    }
	    
		System.out.println(result);
	}
}
