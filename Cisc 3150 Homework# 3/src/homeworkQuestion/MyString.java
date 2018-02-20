package homeworkQuestion;

public final class MyString {
	
	private char chars [];
	
	public MyString(char[] chars) 
		{
			this.chars = chars; // records char array in char chars []
		}
	
	public char charAt(int index) 
		{
			return chars[index]; // returns character of the given index
		}
	
	public int length() 
		{
			return chars.length;  // returns length of char []
		}
	
	public  MyString substring(int begin, int end) 
	
	{
		if(begin >= 0 && begin < chars.length && end >= 0 && end < chars.length) 
		
			{ // makes surebegin and end are within parameters
				char [] newSubString = new char [end-begin+1];
				for (int i = begin;i <= end;i++) 
					{ 
						newSubString[i-1] = chars [i-1]; // copies the necassary characters into a new character array 	
					}
				return new MyString (newSubString); // returns new Mystring object
			}
		
		else
			
			{
				System.out.print("the parameters of the new substring are out of bounds");
				return null;
			}
	}
	
	public MyString toLowerCase() // returns all characters as lowercase
	
		{
			char[] lowerCaseChars = new char[chars.length];
			
			for (int i = 0; i < lowerCaseChars.length; i++)  
			
				{
					lowerCaseChars[i] = Character.toLowerCase(chars[i]);
				}
					
				MyString Lowercase = new MyString (lowerCaseChars);
				
				return Lowercase;
		}
	
	public MyString toUpperCase() // returns all characters as Uppercase
	
	{
		char[] UpperCaseChars = new char[chars.length];
			
			for (int i = 0; i < UpperCaseChars.length; i++)  
			
				{
					UpperCaseChars[i] = Character.toUpperCase(chars[i]);
				}
					
				MyString Uppercase = new MyString (UpperCaseChars);
				
				return Uppercase;
	}
	
	public int compareTo(MyString s) // compares two strings and returns a integer value 0-->equal -1 --> not equal
	
	{
		
	int length = length();
	
		 if(chars == null || s == null) 
		 	{
			 	System.out.println("The String is Empty");
	 			return -1;
		 	} 
		 
		 else if (length != s.length()) 
		 		{
		 			System.out.println ("The strings are not Equal(lengths are different");
 					return -1;
		 		}
		 		
 				else 
 					{
		 				for (int i = 0; i<length;i++) 
		 					{
		 						if (chars[i] != s.chars[i]) 
		 						{
		 							System.out.println ("The strings are not Equal");
		 							return -1;
		 						}
		 					}
		 			 
		 					System.out.println ("The strings are Equal");
		 					return 0; 
		 			}
	}
	
	public MyString getMyString() // gets the character array

		{
			MyString GetString = new MyString (chars);
			return GetString;
		}
	public String toString()  // copies characters into a String and returns it 
	{
		String s = new String("");
		for (int i = 0; i<length(); i++) 
		{
			s = s + chars[i];
		}
		return s;
		
		
	}
	
	public static MyString valueOf (int i) // converts a integer into a string object
	
	{
		 char[] chars = ("" + i).toCharArray();
	        return new MyString(chars);
	}
}


