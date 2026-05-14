class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        int n = matrix[0].length;

        while(left <= right){
            int mid = left + (right - left) / 2;
            //converting 1D to 2D
            int val = matrix[mid / n][mid % n]; 

            if(target == val){
                return true;
            }
            else if(target > val){
                left = mid + 1;
            }
            else if(target < val){
                right = mid - 1;
            }
        }
        return false;
    }
}