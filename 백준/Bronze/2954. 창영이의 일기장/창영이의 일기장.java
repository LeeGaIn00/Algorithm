import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String m[] = {"a", "e", "i", "o", "u"};
		String mm[] = {"apa", "epe", "ipi", "opo", "upu"};
		for(int i = 0; i < 5; i++) {
		    str = str.replaceAll(mm[i], m[i]);
		}
		System.out.println(str);
	}
}
