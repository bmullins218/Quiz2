package tuitionCalc;
import java.util.Scanner;

public class tuitionCalculator{
	public static void main(String[] args) {
		Scanner datainput=new Scanner(System.in); 
	
		double initialTuition;
		double totalTuition;
		double yearlyPercentageIncrease;
		double arp;
		double monthlyPayments;
		double repaymentTime;
		
			System.out.println("Enter the intial tuition:");
			initialTuition = datainput.nextDouble();
			
			System.out.println("Enter tuition yearly increase:");
			yearlyPercentageIncrease = datainput.nextDouble();
		
			System.out.println("Enter ARP payments:");
			arp = datainput.nextDouble();
			
			System.out.println("Enter monthly payments:");
			monthlyPayments = datainput.nextDouble();
			
			System.out.println("Enter repayment time (in years):");
			repaymentTime = datainput.nextDouble();
		
		
		
		
	}

}





