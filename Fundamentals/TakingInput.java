import java.util.Scanner;
public class TakingInput {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter age");
    byte age = sc.nextByte();
    System.out.println("Age =" +age);

    System.out.println("Please enter height4");
    float height = sc.nextFloat();
    System.out.println("Height =" +height);
    sc.close();
   } 
}
