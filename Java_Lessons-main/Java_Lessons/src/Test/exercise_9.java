package Test;

import java.util.Arrays;
import java.util.Random;

public class exercise_9
{
    public static void main(String[] args)
    {
        exercise9();
    }

    public static void exercise9()
    {
        Random random = new Random();
        int size = random.nextInt(5 + 1);

        int[][] arr_1 = new int[size][size];

        for (int row = 0; row < arr_1.length; row++)
        {
            for (int column = 0; column < arr_1.length; column++)
            {
                int numbers = random.nextInt(9 + 1);
                arr_1[row][column] = numbers;
            }
        }
        System.out.println(Arrays.deepToString(arr_1));

        for (int i = 0; i < arr_1.length; i++)
        {
            for (int j = 0; j < arr_1.length ; j++)
            {
                if (arr_1[i][j] <= arr_1[i][arr_1.length-1])
                {
                    System.out.println(arr_1[i][j]);
                    break;
                }
            }

        }
    }
}
