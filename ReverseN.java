import java.util.Scanner;
public class ReverseN {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num = sc.nextInt();
        int r=0;
    for(int i=10; num>0; i--){
        r = num%10;
        System.out.println(r);
        num = num/10;
    }

    }
}
