import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long answer = 0;
        long[] S = new long[n];
        long[] C = new long[m]; // 같은 나머지 인덱스 카운트
        S[0] = sc.nextInt();
        
        for(int i = 1; i < n; i++) 
            S[i] = S[i-1] + sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            int remainder = (int)(S[i] % m);
            if(remainder == 0) answer++;
            C[remainder]++;
        }
        
        for(int i = 0; i < m; i++) {
            if(C[i] > 1) answer += C[i] * (C[i] - 1) / 2;
        }
        System.out.println(answer);
    }
}