import java.util.Scanner;

public class relationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter John's Grades:");
        int john = sc.nextInt();
        System.out.println("Enter sarah grades:");
        int sarah = sc.nextInt();
        if (john > sarah) {
            System.out.println("Johns Performance is better than sarah");
            
        }
        else
            System.out.println("Sarah's performance is better than john");
        sc.close();
    }
}
