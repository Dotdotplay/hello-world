package homeworkQuestions;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useDelimiter(",");// separates input by a comma
		String[] tokens = new String [50]; 
		int i=0;
		while (input.hasNext()) 
			{
				tokens [i] = input.next();// puts tokenized values in a array 
				System.out.printf("%s %n",tokens[i]); //prints out the tokenized values
				i++;
			}
		input.close();
	}

}
