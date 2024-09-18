
class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int height = matrix.length - 1;     // height of the matrix 
        int rowLength = matrix[0].length;
        while (low <= height) {
            int mid = (low + height) / 2;
            if (target >= matrix[mid][0] && target <= matrix[mid][rowLength - 1]) {
                // binary search in this row 
                return binarySearch(matrix, mid, target);
            }
            if (target == matrix[mid][0] || target == matrix[mid][rowLength - 1]) {
                return true;
            }

            // using binary search for row 
            if (target < matrix[mid][0]) {
                height = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    static boolean binarySearch(int[][] mat, int row, int x) {
        int lo = 0, hi = mat[0].length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2; 
            if (mat[row][mid] == x) {
                return true;
            }
            if (mat[row][mid] > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false;
    }
}
