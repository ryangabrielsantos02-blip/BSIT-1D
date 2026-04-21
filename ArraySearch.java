package lab.arrays01;

import java.util.*;

public class ArraySearch {
	public static void main(String args[]) {

	Scanner input = new Scanner(System.in);
	int[] elms = new int[8];
	int searchValue = 0, index = 0, elem = 0;
	boolean isValue = false;
	
	System.out.println("Enter Array Elements: ");
	for (int i = 0; i < elms.length; ++i) {
		elem = input.nextInt();
		elms[i] = elem;
	}

	System.out.println("Array Elements: ");
	for( int elm : elms) {
		System.out.print(elm + " ");
	}
	
	System.out.println();
	System.out.print("Searching for: ");
	searchValue = input.nextInt();
	for (int i = 0; i < elms.length; ++i) {
		if (elms[i] == searchValue) {
       		isValue = true;
		index = i;
		break;
		}
	}
	
	if (isValue) {
		System.out.println("Value found at index " + index);
	} else
		System.out.println("Value not found");


	

}



}