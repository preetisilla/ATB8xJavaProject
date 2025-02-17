package Oct.ex_25Oct2024_Arrays;

public class Lab059_Arrays2D_Iterate {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i< matrix.length; i++){
            for(int j= 0; j< matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
