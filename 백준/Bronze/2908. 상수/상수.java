import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    StringBuffer A = new StringBuffer(sc.next());
	    StringBuffer B = new StringBuffer(sc.next());
	    String a = A.reverse().toString();
	    String b = B.reverse().toString();
	    System.out.print(Math.max(Integer.parseInt(a), Integer.parseInt(b)));
	}
}