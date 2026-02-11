import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String Name = scan.nextLine();
        System.out.println("Enter Your Age:");
        byte Age = scan.nextByte();
        System.out.println("Enter Your Grades:");
        char Grades = scan.next().charAt(0);
        System.out.println("Name of the Student is:" + Name);
        System.out.println("& Age of the Student is:" + Age);
        System.out.println("& Grades of the Student is : " + Grades);
        scan.close();
    }
    
}
