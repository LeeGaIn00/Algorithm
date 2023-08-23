import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        for(int i = arr.length - 1; i >= 0; i--)
            sb.append(arr[i]);
        System.out.println(sb);
    }
}
