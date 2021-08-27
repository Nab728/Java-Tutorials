
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Switch Statements
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Hey");
			break; // if this is written the next case in the switch statement won't
			// execute if the case is == to the variable inputed
			// default will execute if none of the cases work
		}
		
		
	}

}
