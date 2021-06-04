import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DOWFinder dowFinder = new DOWFinder();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the day in dd: ");
		int dd = scanner.nextInt();
		System.out.print("Enter the month in mm: ");
		int mm = scanner.nextInt();
		System.out.print("Enter the year in yyyy: ");
		int yyyy = scanner.nextInt();
		String dow = dowFinder.findDOW(dd, mm, yyyy);
		System.out.println(dow);

	}
}
