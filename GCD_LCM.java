package Assignment1;
import java.util.Scanner;
public class GCD_LCM {
    int GCD(int a, int b){
      while(b != 0){
        int remainder = a % b;
        a = b;
        b = remainder;
      }
      return a;
    }
    long LCM(int a, int b){
        int GCDvalue = GCD(a, b);
        return((long) a / GCDvalue)*b;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        GCD_LCM obj = new GCD_LCM();
        System.out.print("first number: ");
        int a = sc.nextInt();
        System.out.print("Second number");
        int b = sc.nextInt();
        if(a <= 0 || b <= 0){
            System.out.println("invalid input . enter positive integers.");
        }else{
            System.out.println("GCD: " + obj.GCD(a, b));
            System.out.println("LCM: " + obj.LCM(a,b));
        }
    }
}
