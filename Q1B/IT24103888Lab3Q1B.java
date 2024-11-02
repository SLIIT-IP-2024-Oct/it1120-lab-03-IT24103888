import java.util.Scanner;
 
public class IT24103888Lab3Q1B {
    public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the total amount:");
    int totalAmount = scanner.nextInt();

    // Calculation
    double discount = totalAmount * 0.1;
    double amountToPay = totalAmount - discount;

    // Output the results
    System.out.print("The amount to Pay after discount is:" +amountToPay);

   
    }
}
