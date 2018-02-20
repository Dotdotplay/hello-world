package homeworkQuestion;

public class DriverClass {

	public static void main(String[] args) {
		
		char[] chars1 = new char[] {'H','E','L','L','O'};
		MyString str = new MyString(chars1);
		System.out.println("Demonstrates toString() function");
		System.out.println(str.toString());
		System.out.println("Demonstrates GetMystring() function");
		System.out.println(str.getMyString());
		System.out.println("Demonstrates charat() function(index 3 = 'L') ");
		System.out.println(str.charAt(3));
		System.out.println("Demonstrates length() function returns 5");
		System.out.println(str.length());
		System.out.println("Demonstrates toLowerCase() fucntion");
		System.out.println(str.toLowerCase());
		System.out.println("Demonstrates toUpperCase() fucntion");
		System.out.println(str.toUpperCase());
		
		char[] chars2 = new char[] {'H','E','L','L','O'};
		MyString str2 = new MyString(chars2);

		System.out.println("Demonstrates Compareto() function");
		str.compareTo(str2);
		
		System.out.println("Demonstrates substring function(1-3 --> HEL)");
		MyString str3 = str.substring(1 , 3);
		System.out.println(str3.getMyString());
		
		System.out.println("Demonstrates valueOf function");
		MyString str4 = MyString.valueOf(2018);
		System.out.println(str4.getMyString());
		
	}

}
