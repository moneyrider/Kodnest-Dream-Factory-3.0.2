import java.util.Scanner;
public class SimpleIf {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("press the key-1 on the keyboard");
    int n = sc.nextInt();
    if(n==1){
    System.out.println("you have pressed-1 on the keyboard");
    }
    System.out.println("you have  not pressed-1 on the keyboard");
    sc.close();
   } 
}
