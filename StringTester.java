import java.util.Scanner;

public class StringTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        System.out.println("\n=== STRING ANALYSIS ===");
        System.out.println("Original: " + input);
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Trimmed: [" + input.trim() + "]");
        System.out.println("Contains 'Java'? " + input.contains("Java"));
        System.out.println("First character: " + input.charAt(0));
        System.out.println("Starts with 'Hello'? " + input.startsWith("Hello"));
        System.out.println("Ends with '.'? " + input.endsWith("."));

		
	System.out.println("Last character: " + input.charAt(input.length() - 1));
	System.out.println("Replaced: " + input.replace(" ", "_"));
	String part = input.substring(0, 5); 
	System.out.println("First 5 characters: " + part);


        sc.close();
    }
}