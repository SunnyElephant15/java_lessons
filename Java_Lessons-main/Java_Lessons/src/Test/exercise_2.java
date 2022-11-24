package Test;

public class exercise_2
{
    public static void main(String[] args)
    {
        factorialFunction(1);
    }

    public static void factorialFunction(int factorial)
    {

        if (factorial == 0)
        {
            System.out.println(0);
        } else
        {
            int c = 1;
            for (int i = 1; i <= factorial; i++)
            {
                c = c * i;
            }
            System.out.println(c);
        }
    }
}
