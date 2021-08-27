import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		System.out.println("This program converts days to seconds");
		System.out.println("Enter a # of days");
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		//your code goes here
		days = days * 24 * 60 * 60;
		System.out.println(days);
		scanner.close();
	}
}