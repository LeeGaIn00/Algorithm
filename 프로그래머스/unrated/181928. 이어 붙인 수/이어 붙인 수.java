class Solution {
    public int solution(int[] num_list) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) sb2.append(num_list[i]);
            else sb1.append(num_list[i]);
        }
        return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
    }
}