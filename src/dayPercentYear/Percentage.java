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
		for (int i = 0; i <= month; i++) {
			if (((year % 400) != 0) && ((year % 4) == 0) && month == 1) { //Leap Years
				totalDays += Days[i] + 1;
			} else {
				totalDays += Days[i];
			}
		}
		float percent = (float)totalDays/365f;
		System.out.println(percent + "%");
	}
}