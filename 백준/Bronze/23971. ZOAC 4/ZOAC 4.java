import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] temp = br.readLine().split(" ");
	    
	    int H, W, N, M;
	    H = Integer.parseInt(temp[0]);
	    W = Integer.parseInt(temp[1]);
	    N = Integer.parseInt(temp[2]);
	    M = Integer.parseInt(temp[3]);
	    
	    int col = W % (M + 1) == 0 ?  W / (M + 1) : W / (M + 1) + 1;
	    int row = H % (N + 1) == 0 ?  H / (N + 1) : H / (N + 1) + 1;
	    
	    System.out.println(col * row);
	}
}
