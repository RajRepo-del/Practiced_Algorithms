package instructions;

//Find the Sum of Maximum Sum Subarray
//findMaxSumSubArray([1, 7, -2, -5, 10, -1]) 11
//findMaxSumSubArray([5, 1, -4, 2, 3]) 7
//findMaxSumSubArray([1, 10, -1, 11, 5, -30, -7, 20, 25, -35]) 45
//findMaxSumSubArray([-7, 6, -2]) 6

class FindMax {
    public static int findMaxSumSubArray(int[] arr) {
        int len = arr.length;
        int[][] sumarray = new int[len][len];
        int max = 0;
        for(int i =0;i<len;i++){
            int sum = 0;
            for (int j=i;j<len;j++){
                 sum = sum+arr[j];
                sumarray[i][j] = sum;
                if(sum > max){
                    max=sum;
                }
            }
             
        }
        return max;
    }
}