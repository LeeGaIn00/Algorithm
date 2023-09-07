class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int dx[] = {-1, 0, 0, 1};
        int dy[] = {0, -1, 1, 0};
        
        boolean visited[][][] = new boolean[11][11][4];
        
        int x = 5;
        int y = 5;
        
        for(int i = 0; i < dirs.length(); i++) {
            char c = dirs.charAt(i);
            int dir = 0;
            
            switch(c) {
                case 'L':
                    dir = 0;
                    break;
                case 'D':
                    dir = 1;
                    break;
                case 'U':
                    dir = 2;
                    break;
                case 'R':
                    dir = 3;
                    break;
                default:
                    break;
            }
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if(nx < 0 || ny < 0 || nx > 10 || ny > 10)
                continue;
            
            if(!visited[nx][ny][3-dir] && !visited[x][y][dir]) {
                answer++;
                visited[nx][ny][3-dir] = true;
                visited[x][y][dir] = true;
            }
            
            x = nx;
            y = ny;
        }
        
        return answer;
    }
}