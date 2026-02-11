import java.util.Scanner;

public class savings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        int sal = sc.nextInt();
        System.out.println("Enter Yout Monthly Expense: ");
        int expense = sc.nextInt();
        int saving = sal - expense;
        int totalSaving = 0;
        totalSaving += saving;
        totalSaving += saving;
        totalSaving += saving;
        totalSaving += saving;
        totalSaving += saving;
        totalSaving += saving;
        totalSaving += saving;
        totalSaving += saving;
        totalSaving += saving;
        System.out.println("Total savings is " +totalSaving);
        sc.close();
    }
}
