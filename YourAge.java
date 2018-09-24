import java.util.Scanner;
public class YourAge
{

	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		int year;
		int month;
		int day;
	
		int currentYear;
		int currentMonth;
		int currentDay;
		
		System.out.print("What year were you born? (YYYY) ");
		year = in.nextInt();
		
		System.out.print("What month were you born? (MM) ");
		month = in.nextInt();
		
		System.out.print("What day were you born? (DD) ");
		day = in.nextInt();
		
		System.out.println();
		System.out.print("What year is it? (YYYY) ");
		currentYear = in.nextInt();
		
		System.out.print("What month is it? (MM) ");
		currentMonth = in.nextInt();
		
		System.out.print("What day is it? (DD) ");
		currentDay = in.nextInt();
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

