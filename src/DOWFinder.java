import java.awt.print.Printable;

//Find the day of the week of a given date
//
//Create a class DOWFinder and Implement a Java-method called findDOW(int day,int month,int year)that prints out the day of the week for a given day (1..31), month (1..12) and year.
//
//The day of the week of dates between March 1900 and February 2100 can be calculated as follows:
//
//First, you have to calculate the total number of days from 1900/1/1 to the given date (see below, for details). Secondly, you divide this number by 7 with integer remainder: this now is the day of the week, with 0 as sunday, 1 as monday, etc.
//
//To calculate the total number of days you have to implement the following steps:
//
//Subtract 1900 from the given year and multiply the result by 365
//Add the missing leaps years by adding (year - 1900) / 4.
//If the year itself is a leap year and the month is January or February, you have to subtract 1 from the previous result.
//Now add the all days of the year up to the given one to the result (in case of february always 28, because the additional day for a leap year already have been added).
public class DOWFinder {
	private final static int daysOfMonth[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final static String[] DOW = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
			"Saturday" };

	public String findDOW(int day, int month, int year) {
		String dow = "";
		int numOfDay = (year - 1900) * 365;
		numOfDay += (year - 1900) / 4;
		if (isLeapYear(year) && (month == 1 || month == 2)) {
			numOfDay -= 1;
		}
		for (int i = 1; i < month; i++) {
			numOfDay += daysOfMonth[i];
		}
		numOfDay += day;
		dow = DOW[numOfDay % 7];
		return dow;
	}

	private boolean isLeapYear(int year) {
		if (year % 100 == 0) {
			if (year % 400 == 0)
				return true;
			else
				return false;
		} else if (year % 4 == 0)
			return true;
		return false;
	}
}
