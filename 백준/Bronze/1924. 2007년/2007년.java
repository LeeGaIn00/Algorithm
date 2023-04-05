import java.util.*;

public class Main {
	public static void main(String[] args) {
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dow = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int month = 1;
        int temp = 1;
        
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
           
        while(month < m) {
            temp += day[month - 1] % 7;
            month++;
        }
        temp %= 7;
        temp =  temp + ((d - 1) % 7);
        System.out.print(dow[temp % 7]);
	}
}