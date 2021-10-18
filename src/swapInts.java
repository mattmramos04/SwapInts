public class swapInts
{
    public static void main (String[] args)
    {
        int num1 = 5, num2 = 5;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Numbers Before Checking");

        if (num1 > num2)
        {
            num1 = num1 - num2;
            num2 = num1 + num2;
            num1 = num2 - num1;
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Numbers After Checked");
    }
}
