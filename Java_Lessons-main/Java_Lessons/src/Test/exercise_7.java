package Test;

import java.util.Random;

public class exercise_7
{
    public static void main(String[] args)
    {
     doubleArray();
    }

    public static void doubleArray()
    {
        int notEven = 0;
        int even = 0;
        int[][] arr_1 = new int[10][10];

        Random random = new Random();

        for (int row = 0; row < arr_1.length; row++)
        {
            for (int column = 0; column < arr_1.length; column++)
            {
                int numbers = random.nextInt(10 + 1);
                arr_1[row][column] = numbers;
                System.out.print(arr_1[row][column] + "\t");
                if(arr_1[row][column]%2==0)
                {
                    even++;
                } else {
                    notEven++;
                }

            }
            System.out.println();

        }
        System.out.println("Even numbers = " + even + " Not even numbers = " + notEven);
    }
}
