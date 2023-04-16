import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        boolean res = true;
        for(int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int num = 1;
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] >= num) {
                while(A[i] >= num) {
                    st.push(num++);
                    sb.append("+\n");
                }
                st.pop();
                sb.append("-\n");
            }
            else {
                int n = st.pop();
                if(n > A[i]){
                    System.out.println("NO");
                    res = false;
                    break;
                }
                else
                    sb.append("-\n");
            }
        }
        if(res) System.out.println(sb.toString());
	}
}