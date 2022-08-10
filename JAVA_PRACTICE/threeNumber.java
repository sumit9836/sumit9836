import java.util.Scanner;

// import javax.sound.midi.SysexMessage;

public class threeNumber {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("[+] Enter the 1st number ->");
        int a = in.nextInt();
        System.out.print("[+] Enter the 2nd number ->");
        int b = in.nextInt();
        System.out.print("[+] Enter the 3rd number ->");
        int c = in.nextInt();
        System.out.print("The result is "+(a+b+c)/3);
    }
        
    
    
}
