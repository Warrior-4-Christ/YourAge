import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class YourAge
{

	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		Calendar calendar = new GregorianCalendar();
		int year;
		int month;
		int day;

		int currentYear = calendar.get(Calendar.YEAR);
		int currentMonth = calendar.get(Calendar.MONTH) + 1;
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

		System.out.print("What year were you born? (YYYY) ");
		year = in.nextInt();

		System.out.print("What month were you born? (MM) ");
		month = in.nextInt();

		System.out.print("What day were you born? (DD) ");
		day = in.nextInt();
		System.out.println();

		int age = (currentYear - year);

		if(currentMonth < month) {
		--age;
		} else if(currentMonth==month) {
			if(currentDay < day) {
				age --;
			}
		}

		System.out.println("You are " + age + " years old.");

	}
}
