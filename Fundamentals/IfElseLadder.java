import java.util.Scanner;
public class IfElseLadder {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the  no b/w 1-4");
    int n = sc.nextInt();
    if(n==1){
        System.out.println("you have entered 1");
    }
    else if(n==2) {
        System.out.println("you have entered 2");
    }
    else if (n==3){
        System.out.println("you have entered 3");
    }
    else if (n==4){
        System.out.println("you have entered 4");
    }
    
    else{
        System.out.println("Please read the message properly");
    }
   sc.close();
   } 
}
