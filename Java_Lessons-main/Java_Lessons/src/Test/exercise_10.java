package Test;

import java.util.Arrays;

public class exercise_10
{
    public static void main(String[] args)
    {
     exercise10();
    }

    public static void exercise10()
    {
        int size = 4;
        int[][] arr_1 = {
                {1, 0, 0, 0},
                {0, 2, 0, 0},
                {0, 0, 6, 0},
                {0, 0, 0, 2}
        };
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (i != j && arr_1[i][j] != 0)
                {
                    System.out.println("Matrix is not diagonal!");
                } else {
                    System.out.println("Matrix is diagonal!");
                }

            }
        }
        System.out.println(Arrays.deepToString(arr_1));
    }
}
