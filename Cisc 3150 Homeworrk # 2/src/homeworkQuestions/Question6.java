package homeworkQuestions;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useDelimiter(""); // set delimter to this in order to tokenize indivdual characters 
		while (input.hasNext()) {
			System.out.println(input.next()); // prints out every individual character
		}
		input.close();
	}

}
