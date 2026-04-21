import java.util.Scanner;

public class WordAnalyzer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");
        System.out.println("Word count: " + words.length); 

        String without = sentence.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("Without vowels: " + without);

        String longest = words[0]; 
        
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        
        System.out.println("Longest word: " + longest);
    }
}