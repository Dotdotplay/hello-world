package homeworkQuestions;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		System.out.println("How Tall of a pyramid do you want?"); // asks user for height of pyramid 
		Scanner input = new Scanner(System.in);	// initializes scanner 
		int height = input.nextInt(); // inputs the heigt into int height
		
		if (height == 0) {
			
			System.out.println(" Please enter a height amount that is greater than 0");
		}
		
		if (height == 1) {
			System.out.printf("%d", 1);
		}
		
		int space =height;// helps space the pramid correctly using print f 
			if (height > 1) 
				{
			  		for (int i = 1; i <= height; i++) 
			  			
			  			{
			  				for (int j = 1; j <= i; j++) 
			  					{
			  						System.out.printf("%"+space+"d", j);
			  						space = 1;
			  					}
                
			  				for (int k = (i - 1); k >= 1; k--) 
			  					{
			  						System.out.printf("%"+space+"d", k);
			  					}
                
			  				System.out.println();
			  				space=height-i; // makes sure the spacing is correct each corresponding row 
			  			}	
			  		
			}
		
				input.close();
		
        } 
	}


