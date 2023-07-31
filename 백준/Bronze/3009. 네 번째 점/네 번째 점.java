import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int c[][] = new int[3][3];
        int x = 0, y = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++)
                c[i][j] = sc.nextInt();
        }
        // x
        if(c[0][0] == c[1][0]) x = c[2][0];
        else if(c[0][0] == c[2][0]) x = c[1][0];
        else x = c[0][0];
        // y
        if(c[0][1] == c[1][1]) y = c[2][1];
        else if(c[0][1] == c[2][1]) y = c[1][1];
        else y = c[0][1];
        System.out.println(x + " " + y);
	}
}
