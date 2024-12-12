class Solution {
    public int romanToInt(String s) {
        int[] arr = new int[s.length()];
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                arr[i] = 1;
            }
            if(s.charAt(i) == 'V'){
                arr[i] = 5;
            }
            if(s.charAt(i) == 'X'){
                arr[i] = 10;
            }
            if(s.charAt(i) == 'L'){
                arr[i] = 50;
            }
            if(s.charAt(i) == 'C'){
                arr[i] = 100;
            }
            if(s.charAt(i) == 'D'){
                arr[i] = 500;
            }
            if(s.charAt(i) == 'M'){
                arr[i] = 1000;
            }
        }
        int sum = 0;
        for(int j = 0;j < arr.length;j++){
            if(j + 1 < arr.length){
                if(arr[j] < arr[j+1]){
                    sum = sum - arr[j];
                }else{
                    sum = sum + arr[j];
                }
            }else{
                sum = sum + arr[j];
            }
        }
        return sum;
    }
}