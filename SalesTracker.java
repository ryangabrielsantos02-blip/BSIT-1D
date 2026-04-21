package lab.arrays01;

import java.text.*;
import java.util.*;

public class SalesTracker {
	public static void main(String args[]) {
	
	DecimalFormat df = new DecimalFormat("0.00");
	Scanner input = new Scanner(System.in);
	double[] values = new double[7];
	double total = 0, highest = 0, sales = 0;
	
	System.out.println("Daily Sales: ");
	
	for(int i = 0; i < values.length; ++i) {
		System.out.print("Day " + (i + 1) + " : " );
		sales = input.nextDouble();
		values[i] = sales;

	}

	for(double value: values) {
		if(value > highest) {
		highest = value;
		}
		total += value;
		
	}
	
	
	System.out.println();
	System.out.println("Total Sales: " + df.format(total));
	System.out.println("Highest Sale: " + df.format(highest));

	} 


}