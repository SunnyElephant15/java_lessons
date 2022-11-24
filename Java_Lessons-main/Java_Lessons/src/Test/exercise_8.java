package Test;

import java.util.Random;

public class exercise_8
{
    public static void main(String[] args)
    {
    twoDimensionArray();
    }

    public static void twoDimensionArray()
    {
        int[][] arr_1 = new int[5][4];
        Random random = new Random();

        for (int row = 0; row < arr_1.length; row++)
        {
            for (int column = 0; column < arr_1.length - 2; column++)
            {
                int numbers = random.nextInt(9 + 1);
                arr_1[row][column] = numbers;
                System.out.print(arr_1[row][column] + "\t");
            }
            System.out.println(arr_1[row][0] + "\t");
        }
    }
}
