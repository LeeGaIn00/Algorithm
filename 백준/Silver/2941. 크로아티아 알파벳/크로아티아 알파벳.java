import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String cro[] = { "c=", "c-","dz=", "d-", "lj", "nj", "s=", "z=" };
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i = 0; i < cro.length; i++)
		    str = str.replaceAll(cro[i], "!");
		System.out.println(str.length());
	}
}
