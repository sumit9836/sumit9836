import java.util.Scanner;
public class areaPerimeter {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("[+] Enter the radius -> ");
        int radius = input.nextInt();
        System.out.println("The area is"+(3.14159*radius*radius));
        System.out.print("The perimetere is "+(3.14159*2*radius));
    }
}
