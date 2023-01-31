import java.util.Scanner;
public class AddTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc. nextInt();
        int c = a+b;
        System.out.println("Addition Result:"+c);
        sc.close();
    }
}