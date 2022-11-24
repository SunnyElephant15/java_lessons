package Test;

import java.util.Arrays;
import java.util.Random;

public class exercise_5
{
    public static void main(String[] args)
    {
        integerArray();
    }

    public static void integerArray()
    {
        int[] arr_1 = new int[10];
        Random random = new Random();
        int number = random.nextInt(2);
        int c = 0;
        int x = 0;

        for (int i = 0; i < arr_1.length; i++)
        {
            number = random.nextInt(2);
            arr_1[i] = number;
            if(arr_1[i]==0)
            {
                c++;
            }
            if(arr_1[i]==1)
            {
                x++;
            }
        }
        System.out.println(Arrays.toString(arr_1));
        System.out.println("Amount 0: "+ c+"\nAmount 1: "+x);
    }
}
