
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        for(int i = 0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        int k = nums1.length;
        for(int j = 0;j<nums2.length;j++){
            arr[k] = nums2[j];
            k++;
        }

        Arrays.sort(arr);

        if(arr.length % 2 == 1){
            double i = arr[arr.length / 2];
            return i;
        }else{
            double i = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
            return i;
        }
        
    }
}