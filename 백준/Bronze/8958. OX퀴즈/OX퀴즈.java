import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0; i < n; i++) {
	        String str = sc.next();
	        int score = 0;
	        int tmp = 0;
	        for(int j = 0; j < str.length(); j++) {
	            if(str.charAt(j) == 'O') {
	                if(j != 0 && str.charAt(j-1) == 'O') 
	                    tmp++;
	                score++;
	                score += tmp;
	            }
	            else 
	                tmp = 0;
	        }
	        System.out.println(score);
	    }
	}
}
