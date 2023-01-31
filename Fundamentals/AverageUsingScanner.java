
import java.util.Scanner;
public class AverageUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        double avg = sum/3.0;
        System.out.println("Average :" +avg);
        sc.close();
    }
    
}
