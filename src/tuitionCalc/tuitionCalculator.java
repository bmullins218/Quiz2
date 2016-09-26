package tuitionCalc;
import java.util.Scanner;

public class tuitionCalculator{
	public static void main(String[] args){
		static Scanner datainput=new Scanner(System.in); 
	
		public double initialTuition;
		public double totalTuition;
		public double yearlyPercentageIncrease;
		public double arp;
		public double monthlyPayments;
		public double repaymentTime;
	
	
		
		public double getInitialTuition(){
			return initialTuition;
		}
		public void setTuition(double initialTuition){
			this.initialTuition = initialTuition;
		}
		public double getTotalTuiton(){
			return totalTuition;
		}
		public void setTotalTuition(double totalTuition){
			this.totalTuition = totalTuition;
		}
		public double getYearlyPercentageIncrease(){
			return yearlyPercentageIncrease;
		}
		public void setPercentageIncrease(double yearlyPercentageIncrease){
			this.yearlyPercentageIncrease = yearlyPercentageIncrease;
		}
		public double getArp(){
			return arp;
		}
		public void setArp(double arp){
			this.arp = arp;
		}
		public double getMonthlyPayments(){
			return monthlyPayments;
		}
		public void setMonthlyPayments(double monthlyPayments){
			this.monthlyPayments = monthlyPayments;
		}
		
		private void userInputs(){
			System.out.println("Enter the intial tuition:");
			initialTuition = datainput.nextDouble();
			
			System.out.println("Enter tuition yearly increase:");
			yearlyPercentageIncrease = datainput.nextDouble();
		
			System.out.println("Enter ARP payments:");
			arp = datainput.nextDouble();
			
			System.out.println("Enter repayment time (in years):");
			repaymentTime = datainput.nextDouble();
		}
		
		public double monthlyTotalPayments(){
			double year1 = initialTuition;
			double year2 = (initialTuition*(1+yearlyPercentageIncrease/100));
			double year3 = (initialTuition+year2*(1+yearlyPercentageIncrease/100));
			double year4 = (initialTuition+year2+year3*(1+yearlyPercentageIncrease/100));
			double totalTuition = year1+year2+year3+year4;
			System.out.printf("Total tuition amount is %.2f.",totalTuition);
			for (int i=0;i<4;i++){
				totalTuition = totalTuition+((initialTuition*yearlyPercentageIncrease)+initialTuition);
			}
			return totalTuition;	
			}
			System.out.printf("Total tuition of your degree is:",totalTuition);
		}





	
		
		
		
		
		
		
	







