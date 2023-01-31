import java.util.Scanner;
 public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int num = sc.nextInt();
        
        switch (num) {
            case 1:
            System.out.println("You have entered -1");
                break;

                case 2:
            System.out.println("You have entered -2");
                break;

                case 3:
            System.out.println("You have entered -3");
                break;

                case 4:
            System.out.println("You have entered -4");
                break;
        
            default:
            System.out.println("Please read the msg properly");
                break;
        }
        sc.close();
    }

}