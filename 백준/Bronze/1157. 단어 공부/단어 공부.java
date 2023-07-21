import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a[] = new int[26];
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <='z') // 소문자
                a[str.charAt(i) - 'a']++;
            else // 대문자
                a[str.charAt(i) - 'A']++;
        }
        int idx = 0;
        int max = a[0];
        for(int i = 0; i < 26; i++) 
            if(max < a[i]) {
                max = a[i];
                idx = i; 
            }
        for(int i = 0; i < 26; i++) 
            if(idx != i && max == a[i]) {
                System.out.println("?");
                return;
            }
        System.out.println((char)(idx + 'A'));       
	}
}