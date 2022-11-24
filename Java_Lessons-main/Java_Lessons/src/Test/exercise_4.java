package Test;

public class exercise_4
{
    public static void main(String[] args)
    {
        boxes(4,2);
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
}
