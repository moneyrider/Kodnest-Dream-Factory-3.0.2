import java.util.Scanner;
public class AllOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two nos");
        int a = sc.nextInt();
        int b  =  sc.nextInt();
        int c = a+b;
        int d = a-b;
        int e =a*b;
        int f = a/b;
        System.out.println("Addition Result:"+c);
        System.out.println("Subtraction Result:"+d);
        System.out.println("Multiplication  Result:"+e);
        System.out.println("Division Result:"+f);
        sc.close();
    }
}
