import java.util.Scanner;

public class calProgramme {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        System.out.print("[+] Enter the 1st number ->");
        int a = in.nextInt();

        System.out.print("[+] Enter the 2nd number ->");
        int b = in.nextInt();


        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+a*b);
        System.out.println(a+"/"+b+"="+a/b);
        System.out.println(a+"Mod"+b+"="+a%b);
    }
}
