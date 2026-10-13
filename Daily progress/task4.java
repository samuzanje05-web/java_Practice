import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=10; i++){
            System.out.println("enter the numbers");
            int num = sc.nextInt();
             if(num == 50) {
                break;

}
            System.out.println("the number is:"+num);
        }
    }
}
