import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	

	System.out.print("Enter email: ");
	String email = input.nextLine();

	boolean hasAt = email.contains("@");
	boolean hasPeriod = email.indexOf(".") != -1;
	boolean startsAt = !email.startsWith("@");

	if(hasAt && hasPeriod && startsAt){
		System.out.print("Email is VALID");
	}else
		System.out.print("Email is INVALID");



	}
}