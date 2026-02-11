import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The year you want to check if its leap or not: ");
        int year = sc.nextInt();
        if( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ){
            System.out.println("Its a leap Year");
            
        } else
            System.out.println("Not a Leap Year!");
            sc.close();
    }
}
