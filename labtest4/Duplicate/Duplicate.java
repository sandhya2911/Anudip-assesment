package Duplicate;

	import java.util.Scanner;
	public class Duplicate {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = scan.nextLine();
		duplicate(str);
		scan.close();
		}

		private static void duplicate(String str) {
			char string[] = str.toCharArray();  
			int count;
	        
	        System.out.println("Duplicate characters: ");    
	        for(int i = 0; i <string.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <string.length; j++) {  
	                if(string[i] == string[j] && string[i] != ' ') {  
	                    count++;    
	                    string[j] = '0'; // to avoid printing visited character  
	                }  
	            }  
	            if(count > 1 && string[i] != '0')  
	                System.out.println(" "+string[i]+" : "+count+" times");  
	        }  
	        System.out.println();
		}
	}


