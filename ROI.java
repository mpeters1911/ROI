import java.util.Scanner;

public class ROI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the ROI (return on investment) calculator \n");
		System.out.print("How much have you made from your investment over the last year (12 months)(dollars)? : ");
		double moneyMade = input.nextDouble();
		System.out.print(" How much did you originally invest (dollars)? : ");
		double moneyInvested = input.nextDouble();
		
		// Calculate the ROI
		double roi = (moneyMade / moneyInvested) * 100 ;
		
		
		System.out.println(" Here is your return on investment (ROI) : " + roi + "%");
		
		

	}

}
