import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String res = "";
        if(a + b + c != 180) res = "Error";
        else { // a + b + c = 180
            if(a == 60 && b == 60) res = "Equilateral";
            else if(a == b || b == c || a == c) res = "Isosceles";
            else if(a != b && b != c) res = "Scalene";
        }
        System.out.println(res);
	}
}
