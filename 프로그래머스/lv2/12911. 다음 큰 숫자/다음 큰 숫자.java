class Solution {
    public int solution(int n) {
        int answer = 0;
        String str1 = Integer.toBinaryString(n);
        int len1 = 0;
        for(int i = 0; i < str1.length(); i++)
            if(str1.charAt(i) == '1') len1++;
        while(true) {
            String str2 = Integer.toBinaryString(++n);
            int len2 = 0;
            for(int i = 0; i < str2.length(); i++)
                if(str2.charAt(i) == '1') len2++;
            if(len1 == len2) return n;
        }
    }
}