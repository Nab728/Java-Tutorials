import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner integer = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = integer.nextInt();
		
		System.out.println("Enter the cash you have in hand");
		int money = integer.nextInt();
		
		integer.close();
		
		if (age > 18 || money > 500) {
			System.out.println("Yes sir");
		}
		else {
			System.out.println("No sir");
		}
		// conditional statements and || is or && is for and
		// by the way you can use else if instead of nested if statements
		
		if (age <= 0) {
			System.out.println("Error");
		}
		else if (age <= 16 ) {
			System.out.println("Too young");
		}
		else if (age == 17) {
			System.out.println("Wait a year");
		}
		else if (age == 18 && age <= 30) {
			System.out.println("Welcome");
		}
		else if (age > 30) {
			System.out.println("Boomer get out");
		}
	}

}
