package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Year to check if it is a leap year");
		int year = in.nextInt();
		boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 400 == 0;
		System.out.println("Leap year?:" + leapYear);
	}

}
