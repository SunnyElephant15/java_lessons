package Test;

public class exercise_3
{
    public static void main(String[] args)
    {
        multiplicationTable();
    }
    public static void multiplicationTable()
    {
        int x,y;

        for (x = 1; x <= 10 ; x++)
        {
            for (y = 1; y <= 10 ; y++)
            {
                System.out.print(x*y + "\t");
            }
            System.out.println();
        }
    }
}
