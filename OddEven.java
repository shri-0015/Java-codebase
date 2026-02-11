import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No  you want to check even or Odd:");
        int no = sc.nextInt();
        if (no%2 == 1) {
            System.out.println("Number is Odd");
        }
        else
            System.out.println("Number is Even");
    sc.close();
    
}
}
