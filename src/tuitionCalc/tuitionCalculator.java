package tuitionCalc;
import java.util.Scanner;

public class tuitionCalculator{
	public static void main(String[] args){
	
		Scanner datainput=new Scanner(System.in); 
	
		double initialTuition;
		double totalTuition;
		double yearlyPercentageIncrease;
		double arp;
		double monthlyPayments;
		double repaymentTime;
		double year1;
		double year2;
		double year3;
		double year4;
	
//		public double getInitialTuition(){
//			return initialTuition;
//		}
//		public void setTuition(double initialTuition){
//			this.initialTuition = initialTuition;
//		}
//		public double getTotalTuiton(){
//			return totalTuition;
//		}
//		public void setTotalTuition(double totalTuition){
//			this.totalTuition = totalTuition;
//		}
//		public double getYearlyPercentageIncrease(){
//			return yearlyPercentageIncrease;
//		}
//		public void setPercentageIncrease(double yearlyPercentageIncrease){
//			this.yearlyPercentageIncrease = yearlyPercentageIncrease;
//		}
//		public double getArp(){
//			return arp;
//		}
//		public void setArp(double arp){
//			this.arp = arp;
//		}
//		public double getMonthlyPayments(){
//			return monthlyPayments;
//		}
//		public void setMonthlyPayments(double monthlyPayments){
//			this.monthlyPayments = monthlyPayments;
//		}
	
			System.out.println("Enter the intial tuition:");
			initialTuition = datainput.nextDouble();
			
			
			System.out.println("Enter tuition yearly increase:");
			yearlyPercentageIncrease = datainput.nextDouble();
		
			
			System.out.println("Enter ARP payments:");
			arp = datainput.nextDouble();

			
			System.out.println("Enter repayment time (in years):");
			repaymentTime = datainput.nextDouble();
		
			year1 = initialTuition;
			year2 = (initialTuition +(initialTuition*yearlyPercentageIncrease)/100);
			year3 = (year2+(year2*yearlyPercentageIncrease)/100);
			year4 = (year3+(year3*yearlyPercentageIncrease)/100);
			totalTuition = (year1+year2+year3+year4);
			
			System.out.printf("The total tuition for your degree will be:%.1f", totalTuition,"%");
		
	}
}


	

		





	
		
		
		
		
		
		
	







