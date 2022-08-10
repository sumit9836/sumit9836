import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your year ->");
        int year = in.nextInt();

        if ((year % 400 ==0) || (year % 100 == 0) || (year % 4 == 0))
        System.out.print(year+" is a leap year");
        else 
        System.out.print(year+" is not a leap year.");
    }
}
