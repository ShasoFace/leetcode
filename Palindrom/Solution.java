
//Given an integer x, return true if x is a palindrome, and false otherwise.


class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int m = 0;
        int p = x;
        while(p > 0){
            p = p/10;
            m++;
        } 

        int[] count = new int[m];

        for(int i = 0;x > 0;i++){
            count[i] = x % 10;
            x = x/10;
        } 
        int k = count.length - 1;
        for(int j = 0;j < k;j++){
            if(count[k] != count[j]){
                return false;
            }
            k--;
            }
        return true;

    }
}
