import java.util.Scanner;

public class IT24103888Lab3Q2 {
     public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the monthly salary:");
     int monthlySalary = scanner.nextInt();

     System.out.print("Enter the number of OT hours:");
     int otHours = scanner.nextInt();

     System.out.print("Enter the OT hourly rate:");
     int otHourlyRate = scanner.nextInt();

     // Calculation
     int otAmount = otHours * otHourlyRate;
     double totalSalary = monthlySalary + otAmount;

     // Output the results
     System.out.print("The total salary including OT is:" +totalSalary);
     }
}

      