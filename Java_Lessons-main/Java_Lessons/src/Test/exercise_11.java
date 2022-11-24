package Test;

public class exercise_11
{
    public static void main(String[] args)
    {
        exercise11();
    }
    public static void exercise11()
    {
        int[][] arr_1 = new int[8][8];
        for (int row = 0; row < arr_1.length; row++)
        {
            for (int column = 0; column < arr_1.length - 1; column++)
            {
                arr_1[row][column] = 3;
            }

        }
        for (int row = 1; row < arr_1.length; row++)
        {
            for (int column = 1; column < arr_1.length - 1; column++)
            {
                arr_1[row][column] = 2;
            }

        }
        for (int row = 2; row < arr_1.length; row++)
        {
            for (int column = 2; column < arr_1.length - 2; column++)
            {
                arr_1[row][column] = 1;
            }

        }
        for (int row = 3; row < arr_1.length; row++)
        {
            for (int column = 3; column < arr_1.length - 3; column++)
            {
                arr_1[row][column] = 0;
            }

        }

        for (int row = 0; row < arr_1.length; row++)
        {
            for (int column = 0; column < arr_1.length - 1; column++)
            {
                System.out.print(arr_1[row][column] + " ");
            }
            System.out.println(arr_1[row][0] + " ");
        }
    }
}
