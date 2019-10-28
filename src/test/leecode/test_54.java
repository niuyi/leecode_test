package test.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaomi on 2019/10/28.
 */
public class test_54 {

    public static final List<Integer> test(int[][] matrix){
        List<Integer> results = new ArrayList<>();

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i = colStart ; i <= colEnd ; i++){
                results.add(matrix[rowStart][i]);
            }

            rowStart++;

            for(int i = rowStart ;  i <= rowEnd ; i++){
                results.add(matrix[i][colEnd]);
            }

            colEnd--;

            if(rowStart <= rowEnd){
                for(int i = colEnd ; i >= colStart ; i--){
                    results.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;


            if(colStart <= colEnd){
                for(int i = rowEnd ; i >= rowStart ; i--){
                    results.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }

        return results;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        List<Integer> test = test(matrix);

        System.out.print(test);

        int[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.print(test(matrix1));
    }
}
