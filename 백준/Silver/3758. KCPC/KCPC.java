import java.util.*;
import java.io.*;

public class Main
{
    static class Team {
        int id;
        int[] scoreList;
        int submitNum;
        int lastSubmit;
        int totalScore;
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int T = Integer.parseInt(br.readLine());
	
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            Team[] list = new Team[n];
            for(int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                int score = Integer.parseInt(st.nextToken());
                
                if(list[id - 1] == null) {
                    list[id - 1] = new Team();
                    list[id - 1].id = id;
                    list[id - 1].scoreList = new int[k + 1];
                }
                
                list[id - 1].scoreList[num] = Math.max(score, list[id - 1].scoreList[num]);
                list[id - 1].submitNum++;
                list[id - 1].lastSubmit = j;
            }
            
            for(int j = 0; j < n; j++) {
                int sum = 0;
                for(int l = 1; l <= k; l++)
                    sum += list[j].scoreList[l];
                list[j].totalScore = sum;
            }
            Arrays.sort(list, new Comparator<Team>() {
                @Override 
                public int compare(Team o1, Team o2) {
                    if(o1.totalScore == o2.totalScore) {
                        if(o1.submitNum == o2.submitNum) 
                            return o1.lastSubmit - o2.lastSubmit; // 적은 제출 횟수
                        return o1.submitNum - o2.submitNum;
                    }
                    return o2.totalScore - o1.totalScore; // 높은 점수
                }
            });
            
            for(int j = 0; j < n; j++)
                if(list[j].id == t)
                    sb.append(j + 1).append("\n");
        }
        
		System.out.println(sb);
	}
}
