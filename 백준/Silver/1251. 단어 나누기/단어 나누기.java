import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    List<String> list = new ArrayList<>();
	    String str = sc.next();
	    StringBuilder sb1;
	    StringBuilder sb2;
	    StringBuilder sb3;
	    
	    for(int i = 1; i < str.length(); i++) {
	        for(int j = i + 1; j < str.length(); j++) {
	            StringBuilder sb = new StringBuilder();
	            sb1 = new StringBuilder(str.substring(0, i));
	            sb2 = new StringBuilder(str.substring(i, j));
	            sb3 = new StringBuilder(str.substring(j));
	            sb.append(sb1.reverse()).append(sb2.reverse()).append(sb3.reverse());
	            list.add(sb.toString());
	        }
	    }
	    
	    Collections.sort(list);
	    System.out.println(list.get(0)); 
	}
}
