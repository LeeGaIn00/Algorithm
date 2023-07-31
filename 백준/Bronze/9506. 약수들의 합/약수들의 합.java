import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(true) {
            int tmp = 0;
            String str = "";
            int a = sc.nextInt();
		    if(a == -1) return;
		    for(int i = 2; i <= a/2; i++) 
		        if(a % i == 0) {
		            tmp += i;
		            str += " + " + i;
		        }
		    if(tmp + 1 == a) System.out.println(a + " = 1" + str);
		    else System.out.println(a + " is NOT perfect.");
        }
	}
}
