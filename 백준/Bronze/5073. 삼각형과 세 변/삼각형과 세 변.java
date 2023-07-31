import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int arr[] = new int[3];
        while(true) {
            String res = "";
            for(int i = 0; i < 3; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int a = arr[0];
            int b = arr[1];
            int c = arr[2];
            
            if(a == 0 && b == 0 && c == 0) return;
            
            if(c >= a + b) res = "Invalid";
                
            if(!res.equals("Invalid")) {
                if(a == b && b == c) res = "Equilateral";
                else if(a == b || b == c || a == c) res = "Isosceles";
                else if(a != b && b != c) res = "Scalene";
            }
            System.out.println(res);
        }
	}
}
