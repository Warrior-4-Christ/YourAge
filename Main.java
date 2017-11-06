public class Main{

	public static void main(String []args){
	
	// Change the following variables
	// to the values that are true of
	// your birthday
	int year=2003;
	int month=7;
	int day=5;
	
	int currentYear=2017;
	int currentMonth=11;
	int currentDay=13;
	
	int age=(currentYear-year);
	
	if(currentMonth<month){
		--age;
	}
	System.out.println("You are "+age+" years old.");
	}
}

