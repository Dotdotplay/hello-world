package homeworkQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		//check if a string is a palindrome 
		System.out.printf("Enter in a word\n");
		String word ="";
		Scanner input = new Scanner(System.in);
		word = input.nextLine();
		
		String [] arrOfWord = word.split(""); // splits into indivdual characters
		int size = arrOfWord.length;// gets length of arr
		String[] NewArray = new String [size];
		int j = 0;
		
		for (int i = arrOfWord.length-1; i >= 0; i--) 
			{
				NewArray[j]=arrOfWord[i]; // reverses the string into a new array
				j++;
			}
		
		if (Arrays.equals(arrOfWord, NewArray)) 
			{
				System.out.println("The Word is a palindrome"); // check is the arrays are equal to each other
			}													// Determining if its a palindrome or not 
		else
			{
				System.out.println("The Word is not a palindrome");
			}
		
		input.close();
	}
	
	
	
	
}
