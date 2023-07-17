import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int size2=scanner.nextInt();
        int[][] matrix = new int[size][size2];
        int [] result = new int[size];
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size2; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix_transpose(matrix)));
    }

    static int[][] matrix_transpose(int[][] matrix) {
        int temp=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                if(i<j){
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        return matrix;
    }
}
