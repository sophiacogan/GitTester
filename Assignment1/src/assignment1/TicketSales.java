package assignment1;

//import scanner and decimal format
import java.util.Scanner;
import java.text.DecimalFormat;

public class TicketSales {

public static void main(String[] args) {
	
	//Declare Data Members
	int seatA, seatB, seatC;
	double priceA, priceB, priceC, totalSales;
	
	//creating scanner and decimal format
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");

	try {
		// getting input from user
		System.out.print("Enter number of A seats sold: ");
		seatA = sc.nextInt();
		System.out.print("Enter price of A tickets: ");
		priceA =sc.nextDouble();
		System.out.print("Enter number of B seats sold: ");
		seatB = sc.nextInt();
		System.out.print("Enter price of B tickets: ");
		priceB = sc.nextDouble();
		System.out.print("Enter number of C seats sold: ");
		seatC = sc.nextInt();
		System.out.print("Enter price of C tickets: ");
		priceC =sc.nextDouble();
		
		//Calculating total sales
		totalSales = ((seatA * priceA) + (seatB * priceB) + (seatC * priceC));
		
		//displaying Ticket Sales
		System.out.print( "\n \t \t" + "Tickets Sold " +"\t" + "Price Per Ticket");
		System.out.print( "\n \t \t" + "------------- " +"\t" + "----------------");
		System.out.print( "\n" + "A Tickets: " +"\t" + seatA +"\t \t" + df.format(priceA));
		System.out.print( "\n" + "B Tickets: " +"\t" + seatB +"\t \t" + df.format(priceB));
		System.out.println( "\n" + "C Tickets: " +"\t" + seatC +"\t \t" + df.format(priceC));
		System.out.println("\n \t \t"+"Total Sales €"+ df.format(totalSales));
	}finally {
		
		//close scanner
			sc.close();
			
		
		}
}//end method
}//end class
	
	