package test_1;
import java.util.Scanner;

public class test_1 {
	public static void main(String[] args) {
		//define a Scanner
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.print("Enter employee's name:");
		String str_1 = input.next();
		
		System.out.print("Enter number of hours worked in a week:");
		Double num_1 = input.nextDouble();
		
		System.out.print("Enter hourly pay rate:");
		Double num_2 = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate:");
		Double num_3 = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate:");
		Double num_4 = input.nextDouble();
		
		Double sum = num_2*num_1;
		
		//output
		System.out.println("Enter employee's name:" + str_1);
		System.out.println("Hours Worked:" + num_1);
		System.out.println("Pay Rate:" + num_2);
		System.out.println("Gross Pay:" + sum);
		System.out.println("Deductions:" );
		System.out.printf("Federal Withholding (%.2f %):$ %.2f\n",num_3*100,sum*num_3);
		System.out.printf("State Withholding (%.2f %):$ %.2f\n",num_4*100,sum*num_4);
		System.out.println("Total Deduction: $" + (sum*num_3+sum*num_4));
		System.out.println("Net Pay: $" + (sum-sum*num_3-sum*num_4));
	}
}
