package Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Test
{
    public static void main(String[] args)
    {
        exercise11();
    }

    public static void loopFor(int start, int range)
    {
        for (int i = start; start <= range; start+=2)
        {
            System.out.println(start);

        }
    }

    public static void factorialFunction(int factorial)
    {

        if(factorial==0)
        {
            System.out.println(0);
        } else
        {
        int c = 1;
        for (int i = 1; i <= factorial; i++)
        {
            c = c * i;
        }System.out.println(c);
    }

    }

    public static void multiplicationTable()
    {
        int x,y;

        for (x = 1; x <= 10 ; ++x)
        {
            for (y = 1; y <= 10 ; ++y)
            {
                System.out.print(x*y + "\t");
            }
            System.out.println();
        }
    }

    public static void boxes(int coins, int capacity)
    {
        int box = coins/capacity;
        int x = coins % capacity;

        if(x != 0)
        {
            box++;
        }
        System.out.println("Coins in " + box +" boxes");
        if(x !=0)
        {
            System.out.println("Last box contains " + x);
        }

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


    public static void primeNumbers(int length)
    {
        for (int i = 2; i <= length; i++)
        {
            boolean isPrime = true;
            for (int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    // is prime so we don't need to check further
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(i);
            }
        }
    }

    public static void sitoErastotenesa(int size)
    {
        boolean[] isPrime = new boolean[size];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i < isPrime.length; i++)
        {
                for (int j = i*2; j < isPrime.length; j+=i)
                {
                    isPrime[j]=false;
                }
        }
        for (int i = 0; i < isPrime.length; i++)
        {
            if(isPrime[i])
                System.out.println(i);
        }
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





