import java.util.*;

class Solution {
    
    static boolean[][] visited;
    static int n, m;
    
   	static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
    static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우
    
    public int solution(int[][] maps) {
       
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        
        bfs(0, 0, maps);
        
        return maps[n-1][m-1] == 1 ? -1 : maps[n-1][m-1];
    }
    static void bfs(int x, int y, int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        
        while(!queue.isEmpty()) {
            int now[] = queue.poll();
            int nowX = now[0];
            int nowY = now[1];
            
            for(int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                
                if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) 
                    continue;
                if(visited[nextX][nextY] || maps[nextX][nextY] == 0)
                    continue;
                
                queue.add(new int[] {nextX, nextY});
                maps[nextX][nextY] = maps[nowX][nowY] + 1;
                visited[nextX][nextY] = true;
            }
        }
    }
}