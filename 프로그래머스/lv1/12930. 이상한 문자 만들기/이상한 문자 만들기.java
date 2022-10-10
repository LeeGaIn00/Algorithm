class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(" ")) {
                index = 0;
            }
            else if(index % 2 != 0) {
                arr[i] = arr[i].toLowerCase();
                index++;
            }
            else {
                arr[i] = arr[i].toUpperCase();
                index++;
            }
        }
        
        return String.join("", arr);
    }
}