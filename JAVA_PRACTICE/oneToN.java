import java.util.Scanner;
public class oneToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("[+] Enter the n nember ->");
        int n = in.nextInt();
        int s = 0;
        // for (int i = 1; i>=n ; i++)
        // {
            // s = s+i;
        // }
        int i =0;
        while (i!=n) {
            s = s+i;
            i+=1;
            
        }
        System.out.print("The result is "+s);
    }
    
}
