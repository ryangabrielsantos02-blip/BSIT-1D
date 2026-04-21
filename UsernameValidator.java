import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	

	System.out.print("Enter username: ");
	String username = input.nextLine();
	char firstChar = username.charAt(0);

	boolean has8 = username.length() >= 8;
	boolean noSpace = !username.contains(" ");
	boolean isLetter = Character.isLetter(firstChar);

	
	if (has8 && noSpace && isLetter){
		System.out.print("Username is VALID");
	}else
		System.out.print("Username is INVALID");









	}
}