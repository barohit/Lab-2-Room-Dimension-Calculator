import java.util.Scanner;

public class RoomCalculator {
	
	public static void main(String[] args) {
	
		System.out.println("Welcome to Grand Circus' Room Detail Generator!"); 
		System.out.println("");  
		Scanner scan = new Scanner(System.in); 
		boolean usersWish = true; 
				
		while (usersWish == true) {
					
			System.out.println("Enter length: ");
			double length = scan.nextDouble(); 
			System.out.println("Enter width: ");
			double width = scan.nextDouble(); 
			System.out.println("Enter height: "); // for extra challenge; 
			double height = scan.nextDouble(); 
				
			double area = length * width; 
			double perimeter = 2 * (length + width); 
			double volume = area * height; 
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


