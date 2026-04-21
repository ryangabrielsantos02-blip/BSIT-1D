package lab.arrays01;

import java.util.*;

public class ExamAnalysis {
	public static void main(String args[]) {
	
	Scanner input = new Scanner(System.in);
	int[] scores = new int[10];
	int pctr = 0, fctr = 0;
	
	System.out.println("Enter Exam Scores: ");
	for (int i = 0; i < scores.length; ++i){
		int score = input.nextInt();
		scores[i] = score;
	}

	
	System.out.println("Exam Scores: ");
	
	for (int score : scores) {
		if (score >= 75) {
			pctr++;
		} else
			fctr++;
	
	System.out.print(score + " ");

	}
	System.out.println();
	System.out.println("Passed: " + pctr);
	System.out.println("Failed: " + fctr);

	


	}





}