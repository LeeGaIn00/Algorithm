import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(c >= 'A' && c <= 'Z') sb.append((char)(c+32));
            else sb.append((char)(c-32));
        }
        System.out.println(sb.toString());
    }
}