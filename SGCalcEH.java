import java.util.*;
import java.text.*;

public class SGCalcEH {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String name = ""; 
        double average = 0;
        double grades[] = new double[3];

        do {
            System.out.print("Enter student name: ");
            name = input.nextLine();

            if (name.trim().isEmpty()) {
                System.out.println("Invalid Name: Name cannot be empty.");
            } else if (!name.matches("[a-zA-Z ]+")) {
                System.out.println("Invalid Name: Name must contain letters only.");
            }
            
        } while (name.trim().isEmpty() || !name.matches("[a-zA-Z ]+"));

        int i = 0;
	String gradeInput = "";
	double grade = 0;
	
	while (i < grades.length) {
        try {
           		
                System.out.print("Enter grade " + (i + 1) + ": ");
                
                
                gradeInput = input.nextLine();
                
		
    		if (gradeInput.trim().isEmpty()) {
       		    throw new ArithmeticException("Invalid Input: Grade input cannot be empty.");
    		}
		
		grade = Double.valueOf(gradeInput);

                if (grade < 0) {
                    throw new ArithmeticException("Error: Grade cannot be negative.");
                } else if (grade > 100) {
                    throw new ArithmeticException("Invalid Input: Grade must not exceed 100.");
                }

		grades[i] = grade;
                average += grades[i];
		++i;
            
            

        } catch (NumberFormatException e) {
            System.out.println("Invalid number input. Please enter numbers only.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
	
	}

	    System.out.println();
	    System.out.println("Student Name: " + name);
            System.out.println("Average: " + df.format(average / grades.length));
    }
}