class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
     List<Integer> ans = new ArrayList<>();
     for(int i=0; i<matrix.length; i++){
        int min = matrix[i][0];
        int cols = 0;
        for(int j=0; j<matrix[i].length; j++){
            if(matrix[i][j] < min){
                min = matrix[i][j];
                cols = j;
            }
        }
        boolean isLucky = true;
        for(int k=0; k<matrix.length; k++){
            if(matrix[k][cols] > min){
                isLucky = false;
                break;
            }
        }
        if(isLucky){
            ans.add(min);
        }
     }
     return ans;   
    }
}