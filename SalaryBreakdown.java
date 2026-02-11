import java.util.Scanner;

public class SalaryBreakdown {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Basic Salary: ");
    double sal = sc.nextDouble();
    double HRA = sal * 20 / 100;
    double DA = sal * 10 / 100;
    double PF = sal * 8 / 100;
    double netsal = sal + HRA + DA - PF;
    System.out.println("Your Basic Salary is: " + sal+ " \n  HRA: " + HRA  +" \nDA: " +DA  + "\nPF: " +PF + " \nAnd Net Salary is: "
+netsal);
sc.close();
    }
}