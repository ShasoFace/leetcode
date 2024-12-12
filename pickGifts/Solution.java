
import java.util.Arrays;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 1;i<=k;i++){
            Arrays.sort(gifts);
            gifts[gifts.length - 1] = (int) Math.sqrt(gifts[gifts.length - 1]);
        }
        long m = 0;
        for(int i = 0;i<gifts.length;i++){
            m = m + gifts[i];
        }
        return m;
    }
}
