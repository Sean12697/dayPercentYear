package dayPercentYear;
import java.util.*;

public class Percentage {
	public static int Days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_MONTH);
		int month = now.get(Calendar.MONTH);
		int year = now.get(Calendar.YEAR);
		int totalDays = 0;
		int maxDays = 365;
		boolean leapYear = false;
		if (((year % 400) != 0) && ((year % 4) == 0)) {
			leapYear = true;
			maxDays = 366;
		}
		for (int i = 0; i < month; i++) {
				totalDays += Days[i];
				if (month == 1 && leapYear) { 
					totalDays += 1;
				} 
		}
		totalDays += day;
		float percent = ((float)totalDays/(float)maxDays)*100;
		System.out.println(percent + "%");
	}
}