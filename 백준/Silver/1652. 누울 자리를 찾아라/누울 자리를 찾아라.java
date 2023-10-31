import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int row = 0; 
	    int col = 0;
	    
	    int N = Integer.parseInt(br.readLine());
	    char arr[][] = new char[N+1][N+1];
	    
	    for(int i = 0; i < N; i++) {
	        String str = br.readLine();
	        for(int j = 0; j < N; j++)
	            arr[i][j] = str.charAt(j);
	        arr[i][N] = arr[N][i] = 'X';
	    }
	    
	    for(int i = 0; i < N; i++) {
	        for(int j = 0; j < N - 1; j++) {
	            if(arr[i][j] == '.' && arr[i][j + 1] == '.' && arr[i][j + 2] == 'X') 
	                row++;
	                
	             if(arr[j][i] == '.' && arr[j + 1][i] == '.' && arr[j + 2][i] == 'X')
	                col++;
	        }
	    }
	   
	    System.out.println(row + " " + col);
	}
}