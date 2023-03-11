class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {
                for(int j = 0; j < db[0].length; j++) {
                    if(db[i][j].equals(id_pw[1])) return "login";
                }
                return "wrong pw";
            }
        }
        return "fail";
    }
}