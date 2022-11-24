package Test;

import java.util.Arrays;
import java.util.Random;

public class exercise_6
{
    public static void main(String[] args)
    {
        arrayRandom();
    }

    public static void arrayRandom()
    {
        Random random = new Random();
        int length = random.nextInt(10);
        int numbers = random.nextInt(50);

        int arr_1[] = new int[length];
        Arrays.fill(arr_1, numbers);
        System.out.println(Arrays.toString(arr_1));
    }
}
