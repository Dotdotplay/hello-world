package homeworkQuestions;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		
		int year = 0;
		int FirstOfJan;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year");
		year = input.nextInt();
		System.out.println("Enter the # of the first day of January");
		FirstOfJan = input.nextInt();
		int spaces = FirstOfJan-1;// minus 1 day to make the spaces line up as sunday being day 1
		
		for (int M = 1; M <= 12; M++) 
			{
            // Display the month and year
            System.out.printf("%20s %2d %n", getMonthName(M), year );

            
            // Display calender
            System.out.printf("  Su   Mo   Tu   We   Th   Fr   Sa %n");
            
            	
            		for (int j=0; j<spaces; j++) 
            			
            			{ 
            				System.out.printf("     "); // spaces out where to start from
            			}
            		
            	
            for (int i = 1; i<=getNumberOfDaysInMonth(year,M);i++) 
            	
            	{
            		System.out.printf(" %3d ", i); // spaces out the month numbers
            
            		if (((i + spaces) % 7 == 0) || (i == getNumberOfDaysInMonth( year, M))) System.out.printf("%n"); // knows when to skip a line 
               
	            }

	            System.out.printf("%n");
	            spaces = (getNumberOfDaysInMonth( year, M) + spaces) % 7;
           }
			input.close();
		}
	
	
	static String getMonthName(int month) // returns the name of the month
	{	
	String monthName = "";
		switch (month)
			{
				case 1: monthName = "January"; break;
				case 2: monthName = "February"; break;
				case 3: monthName = "March"; break;
				case 4: monthName = "April"; break;
				case 5: monthName = "May"; break;
				case 6: monthName = "June"; break;
				case 7: monthName = "July"; break;
				case 8: monthName = "August"; break;
				case 9: monthName = "September"; break;
				case 10: monthName = "October"; break;
				case 11: monthName = "November"; break;
				case 12: monthName = "December";
			}
	
	return monthName;
	}
	
	static int getNumberOfDaysInMonth(int year, int month) // returns the # of day in the month and checks for leap year
	{
		
	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
		{
		return 31;
		} 
		else if (month == 4 || month == 6 || month == 9 || month == 11) 
		{
		return 30;
		} 
		else if (month == 2) 
		{
			if(isLeapYear(year)) 
				{
				return 28;
				} 
			else 
				{	
				return 29;	
				}
		}
	
	return 0; 
	
	}
	
	
	
	public static boolean isLeapYear(int year) // check for leap year function 
	
	{
		
	return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	
	}
}
