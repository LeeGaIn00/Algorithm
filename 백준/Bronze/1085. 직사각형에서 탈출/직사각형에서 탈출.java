import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int xd = Math.abs(x) < Math.abs(x - w) ? Math.abs(x) : Math.abs(x - w);
        int xy = Math.abs(y) < Math.abs(y - h) ? Math.abs(y) : Math.abs(y - h);
        System.out.println(Math.min(xd, xy));
    }
}
