import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a == 0 && b == 0) return;
		    if(b % a == 0) // 약수
		        System.out.println("factor");
		    else if(a % b == 0)
		        System.out.println("multiple");
		    else
		        System.out.println("neither");
        }
	}
}
