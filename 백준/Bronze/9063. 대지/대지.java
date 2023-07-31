import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int maxX = x[0], minX = x[0];
        int maxY = y[0], minY = y[0];
        for(int i = 1; i < n; i++) {
            // x
            if(maxX < x[i]) maxX = x[i];
            if(minX > x[i]) minX = x[i];
            // y
            if(maxY < y[i]) maxY = y[i];
            if(minY > y[i]) minY = y[i];
        }
        System.out.println((maxX - minX) * (maxY - minY));
	}
}