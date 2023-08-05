import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str[] = new String[5];
	    StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length; i++) 
		    str[i] = sc.next();
        for(int i = 0; i < 15; i++)
            for(int j = 0; j < 5; j++)
                if(str[j].length() > i)
                    sb.append(str[j].charAt(i));
        System.out.println(sb.toString());;
	}
}
