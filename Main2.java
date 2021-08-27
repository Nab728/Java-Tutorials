import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  /* System.out.println("Hello World");
	   int y = 2;
	   System.out.println(y);
	   int y = 3;
	   System.out.println(y);
	  */ //This is an error code since there are duplicate local variables y
		int value = 2;
		int y = 3;
		y -= value;
		// does y = y-value
		
		System.out.println(value);
		System.out.println(y);
		
		int value1 = 2;
		int y1 = 3;
		y1 += value1;
		// does y1 = y1 + value1
		System.out.println(value1);
		System.out.println(y1);
		
		int x = 2;
		int y2 = ++x;
		System.out.println(y2);
		// does y2 = x+1
		int y3 = x++;
		// does y3 = x and then does x+1 after
		System.out.println(y3);
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter number to add");
		int number =  num1.nextInt();
		int finalnumber = ++number;
		System.out.println("Your final number is "+finalnumber+".");
	}

}
