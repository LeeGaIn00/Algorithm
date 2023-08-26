import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            String str[] = s.split(" ");
            sb.append("Case #" + (i + 1) + ": ");
            for(int j = str.length - 1; j >= 0; j--)
                sb.append(str[j] + " ");
            System.out.println(sb);
        }
    }
}
