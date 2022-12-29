package Return;

import java.util.Scanner;

public class ReturnXChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string :: ");
		String str = scan.nextLine();		
		returnXstring(str);
		scan.close();
	}

	private static void returnXstring(String str) {
		StringBuilder string = new StringBuilder(str);
		
		System.out.print("Return Value::");
		for (int i = 0; i < string.length()-4; i++) {
			string.setCharAt(i, 'X');		
			
		}
		System.out.print(string);
	}
}
