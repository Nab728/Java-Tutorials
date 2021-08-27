import java.util.Scanner; // imports the scanner which allows to gain user input
	class Main {
		public static void main (String[] args) {
			Scanner myVar = new Scanner(System.in); // puts a variable as a scanner
			
			System.out.println("What is your name? ");
			String name = myVar.nextLine(); 
			/* Initiates a command to scan the next line which is the
			  user inputed line and sets it to the string variable name
			 */
			myVar.close(); //stops the error of the scanner variable
			
			System.out.println("Hello "+name);
			// name 
			System.out.println("Write a number between -128 to 127!");
			byte bits = myVar.nextByte();
			System.out.println("Write a decimal.");
			double dog = myVar.nextDouble();
			System.out.println("Your decimal was "+dog+".");
			System.out.println("You wrote this "+bits+" number!");
			
			int x = 15;
			int y = 4;
			int result = x/y;
			System.out.println(result); // result is int variable so only whole number
	}
}

