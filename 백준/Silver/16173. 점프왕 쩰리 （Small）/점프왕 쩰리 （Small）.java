import java.util.*;
import java.io.*;

public class Main
{
    static int map[][];
    static boolean check = false;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    map = new int[N][N];
	    
	    for(int i = 0; i < N; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        for(int j = 0; j < N; j++)
	            map[i][j] = Integer.parseInt(st.nextToken());
	    }
	    
	    dfs(0, 0, N);
	    
	    if(check) System.out.println("HaruHaru");
	    else System.out.println("Hing");
	}
	
	static void dfs(int x, int y, int last) {
	    if(map[x][y] == 0)
	        return;
	    
	    if(map[x][y] == -1) {
	        check = true;
	        return;
	    }
	    
	    if(x + map[x][y] >= 0 && x + map[x][y] < last)
	        dfs(x + map[x][y], y, last);
	   
	    if(y + map[x][y] >= 0 && y + map[x][y] < last)
	        dfs(x, y + map[x][y], last);
	       
	}
}