import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle AMT.: ");
        int amt = sc.nextInt();
        System.out.println("Enter Rate of Interest: ");
        int ROT = sc.nextInt();
        System.out.println("Enter Time period : ");
        int time = sc.nextInt();
        double interest = amt * ROT / 100  * time ;
        System.out.println("Your total Interest is : " +interest);
        sc.close();
    }
}
