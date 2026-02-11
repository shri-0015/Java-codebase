import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No.: ");
        double no1 = sc.nextInt();
        System.out.println("Enter Operation to perform:");
        char ops = sc.next().charAt(0);
        System.out.println("Enter 2nd No: ");
        double no2 = sc.nextInt();
        // System.out.println("Your Operation to perform no1 and no2 is: " +ops);
        if(ops=='+' || ops== '-' || ops=='/' || ops=='*'|| ops=='%') {       
        if (ops == '+') {
            System.out.println("Addtion of No1 and No2 is :" + (no1 + no2) );
        }
        else if (ops ==  '-') {
            System.out.println("Substraction of 2 numbers is : " +(no1 - no2));
        }
        else if (ops == '*') {
        System.out.println("Product is :" + (no1 * no2));    
        }
        else if (ops == '/') {
            if (no2==0)
                System.out.println("enter non zero values :");
            else
                System.out.println("Quotient is: " + (no1 / no2));            
        }
        else if (ops == '%') {
            System.out.println("Modulus is:" + (no1 % no2));
            
        }
    }
    else{
        System.out.println("Enter valid operator : ");
    }
sc.close();
}
}