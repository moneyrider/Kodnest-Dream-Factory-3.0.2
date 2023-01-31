import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        System.out.println("Press tke key-1 on the keyboard");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println("You have pressed 1 on the keyboard");
        }
        else{
            System.out.println("you haven't pressed 1 on the keyboard");
        }
        sc.close();

    }
    
}
