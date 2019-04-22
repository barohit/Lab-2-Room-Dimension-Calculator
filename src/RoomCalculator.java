import java.util.Scanner;

public class RoomCalculator {
	
	public static void main(String[] args) {
	
		System.out.println("Welcome to Grand Circus' Room Detail Generator!"); 
		System.out.println("");  
		Scanner scan = new Scanner(System.in); 
		boolean usersWish = true; 
				
		while (usersWish == true) {
			
			boolean validLen = false; 
			boolean validWid = false; 
			boolean validHei = false; 
			String length = ""; 
			String width = ""; 
			String height = ""; 
			
			while (validLen == false) { 
				
				System.out.println("Enter length: ");
				length = scan.next(); 
			
				validLen = true; 
			
				for (int i = 0; i < length.length(); i++) {
					if (Character.isDigit(length.charAt(i)) == false && length.charAt(i) != '.') {
						validLen = false; 
					}
				}
				
				for (int i = 0; i < length.length() - 1; i++) {
					if (length.charAt(i) == '.' && length.charAt(i + 1) == '.') {
						validLen = false; 
					}
				}
			
				if (validLen == false) {
					System.out.println("Error, invalid entry, please enter again: ");
					System.out.println("");
				}
			} 
			
			while (validWid == false) { 
				
				System.out.println("Enter width: ");
				width = scan.next(); 
			
				validWid = true; 
			
				for (int i = 0; i < width.length(); i++) {
					if (Character.isDigit(width.charAt(i)) == false && width.charAt(i) != '.') {
						validWid = false; 
					}
				}
				
				for (int i = 0; i < width.length() - 1; i++) {
					if (width.charAt(i) == '.' && width.charAt(i + 1) == '.') {
						validWid = false; 
					}
				}
			
				if (validWid == false) {
					System.out.println("Error, invalid entry, please enter again: ");
					System.out.println("");
				}
			} 
			
			while (validHei == false) { 
				
				System.out.println("Enter height: ");
				height = scan.next(); 
			
				validHei = true; 
			
				for (int i = 0; i < height.length(); i++) {
					if (Character.isDigit(height.charAt(i)) == false && height.charAt(i) != '.') {
						validHei = false; 
					}
					
				}
				
				for (int i = 0; i < height.length() - 1; i++) {
					if (height.charAt(i) == '.' && height.charAt(i + 1) == '.') {
						validHei = false; 
					}
				}
			
				if (validHei == false) {
					System.out.println("Error, invalid entry, please enter again: ");
					System.out.println(""); 
				}
			} 
				
			double area = Double.parseDouble(length) * Double.parseDouble(width); 
			double perimeter = 2 * (Double.parseDouble(length) + Double.parseDouble(width)); 
			double volume = area * Double.parseDouble(height); 
			System.out.println("");  
			System.out.println("Area: " + area); 
			System.out.println("Perimeter: " +  perimeter);  
			System.out.println("Volume: " + volume); 
				
			scan.nextLine();  //garbage line
				
			System.out.println(""); 
			System.out.println("Continue? (y/n)");  	
				
			String wish = scan.next();
			if (wish.equals("n") || wish.equals("N")) { // in case user inputs upper or lowerCase. 
				usersWish = false; 
				System.out.println("Thank you for using the Room Detail Generator!"); 
			} 
				
		}
		scan.close(); 
				
	}
}


