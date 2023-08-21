import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++)
            queue.add(i);
        sb.append('<');
        while(queue.size() > 1) {
            for(int i = 0; i < K - 1; i++)
                queue.add(queue.remove());
            sb.append(queue.remove()).append(", ");
        }
        sb.append(queue.poll()).append('>');
        System.out.println(sb);
    }
}
