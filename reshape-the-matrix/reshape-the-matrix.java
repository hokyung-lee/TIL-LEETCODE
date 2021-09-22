class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        // Not possible and Illegal
        if (m*n != r*c) {
            return mat;
        }
        
        // Array into ArrayList
        List<Integer> matList = new ArrayList<>();
        
        for(int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                matList.add(mat[i][j]);
            }
        } 
        
        int[][] result = new int[r][c];
        
        int count = 0;
        for(int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                result[i][j] = matList.get(count++);
            }
        }
        return result;
    }
}