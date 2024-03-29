import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int apt[][] = new int[15][15];
	    for(int i = 0; i < 15; i++) {
	        apt[0][i] = i;
	        apt[i][1] = 1;
	    }
	    
	    for(int i = 1; i < 15; i++) {
	        for(int j = 2; j < 15; j++)
	            apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
	    }
	    
	    int T = sc.nextInt();
	    
	    for(int i = 0; i < T; i++) {
	        int k = sc.nextInt();
	        int n = sc.nextInt();
	        
            System.out.println(apt[k][n]);   
	    }
	}
}
