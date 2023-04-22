class Solution {
    public int solution(int a, int b) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        sb1.append(a).append(b);
        sb2.append(b).append(a);
        return Integer.parseInt(sb1.toString()) >= Integer.parseInt(sb2.toString()) ? Integer.parseInt(sb1.toString()) : Integer.parseInt(sb2.toString());
    }
}