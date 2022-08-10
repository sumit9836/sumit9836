import java.util.Scanner;

public class inputNumbers {
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the 1st number :");
        int num1 = in.nextInt();

        System.out.print("Enter the 2nd value :");
        int num2 = in.nextInt();

        System.out.print(num1+"*"+num2+"="+num1*num2);
    }
}
