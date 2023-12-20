import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    boolean[][] map = new boolean[101][101];
	    
	    for(int i = 0; i < 4; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int x1 = Integer.parseInt(st.nextToken());
	        int y1 = Integer.parseInt(st.nextToken());
	        int x2 = Integer.parseInt(st.nextToken());
	        int y2 = Integer.parseInt(st.nextToken());
	        
	        for(int x = x1; x < x2; x++) 
	            for(int y = y1; y < y2; y++)
	                map[x][y] = true;
	    }
	    
	    int cnt = 0;
	    for(int i = 0; i < 101; i++) 
	        for(int j = 0; j < 101; j++)
	            if(map[i][j]) cnt++;

	    System.out.println(cnt);

	}
}