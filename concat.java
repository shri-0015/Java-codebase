import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String Name = sc.nextLine();
        System.out.println("Enter Your Favorite Hobby: ");
        String hobby = sc.nextLine();
        System.out.println("Hello " + Name + " Your Favorite Hobby is " + hobby);
    sc.close();
    }
}
