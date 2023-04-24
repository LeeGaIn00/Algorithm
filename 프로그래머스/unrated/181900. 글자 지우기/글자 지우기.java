class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuffer sb = new StringBuffer();
        String[] str = my_string.split("");
        for(int i = 0; i < indices.length; i++)
            str[indices[i]] = " ";
        for(int i = 0; i < str.length; i++)
            if(!str[i].equals(" ")) sb.append(str[i]);
        return sb.toString();
    }
}