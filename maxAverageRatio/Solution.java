class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int e = extraStudents; 
        while(e > 0){
            int merker = 0;
        for(int i = 0;i < classes.length;i++){
            double r = ((double)classes[merker][0] + 1) / ((double)classes[merker][1] + 1);
            double r1 = ((double)classes[i][0] + 1) / ((double)classes[i][1] + 1);
            if( r - ((double)classes[merker][0] / (double)classes[merker][1])  < r1 - ((double)classes[i][0] / (double)classes[i][1])) {
                merker = i;
            }
        }
        classes[merker][0] += 1;
        classes[merker][1] += 1;
        e--;
    }
    double res = 0.0;
    for(int k = 0;k<classes.length;k++){
        res += ((double)classes[k][0] / (double)classes[k][1]);
    }
    return res / classes.length;     
}
}
