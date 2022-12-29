package Invalid;

import java.util.Scanner;

public class InvalidEmail {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter E-mail::");
		String email = sc.next();
		
		try 
		{ 
			if (!email.contains(".") || !email.contains("@") || !email.substring(email.indexOf("@")).contains("."))
			{
				throw new InvalidEmailException("Invalid E-mail"); 
			}
			System.out.println("valid");
		} 
		
		catch (InvalidEmailException e) 
		{
			System.out.println(e); 
		}
			    
		finally
		{
			sc.close(); 
		}
		
	}
}

