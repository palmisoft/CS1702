package lab8;

import java.time.Month;

import java.util.Scanner;

public class CS1702_Lab8 {

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);

		System.out.println("1) ");
		System.out.println("2) 8.4.1 Even/Odd");
		System.out.println("3) 8.4.2 Reverse String");
		System.out.println("4) 8.4.3 Leap Year");
		System.out.println("5) 8.4.4 Days in a Month ");
		System.out.println("6) 8.4.5 Days Alive");
		System.out.println("7) ");
		System.out.println("Choose a section");


		int section = 0;
		section = in.nextInt();

		/*This menu has been implemented to organise the subclasses so 
		 * then the user can run a desired section without executing all of it  */
		switch (section)
		{	
		case 1:
		
			break;
		case 2:
			even_odd();
			break;
		case 3:
			Reverse_string();
			break;
		case 4:
			Validation_year();
			break;
		case 5:
			input_month();
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		default:
			main(null);
			break;
		}
		
		
		
		
	}
	public static void even_odd()
	{
		int i;
		boolean eo;
		String s = "";

		for(i=1;i<=25;++i)
		{
			eo = EvenOdd(i);
			s = (eo)?"Even":"Odd";
			System.out.println(i + " is a " + s);
		}

	}
	public static boolean EvenOdd(int x)
		{
			if (x % 2 == 0){
				return true;
			}
			else {
				return false;
			}
		}
	public static void Reverse_string()
{
	Scanner in = new Scanner(System.in);
	String s = "";
	System.out.println("introduce a word");
	s = in.next();
	
	if (s.matches("[a-zA-z]+") == true)
			{
		StringBuilder rs = new StringBuilder(s);	
		System.out.println(rs.reverse());
		
			}	
	else {
		System.out.println("Please introduce a String which contains "
				+ "letters a to z");
		Reverse_string();
		
	}
}
	public static boolean Leap_year(int year)
	{
		
		if ( year % 4 == 0 || year % 400 ==0){

			if ( year % 100 == 0){
				return false;
			}
			else {
				return true;
			}
		}
		else 
		{
			return false;
		}	
	}
	public static void Validation_year()
	{

		Scanner in = new Scanner (System.in);
		int year = 0;
		
		System.out.println("introduce a year");
		year = in.nextInt();
		boolean leap;
		String s = "";
		
		leap = Leap_year(year);
		s = (leap)?"leap":"not a leap";
		System.out.println(year + " is " + s);


	}
	public static void input_month()
	{
		String month = "";
		
		Scanner in = new Scanner(System.in);


		System.out.println("introduce the month");
		month = in.next();

		
		if (month.matches("[a-zA-z]+") == true)
		{
			/*Month.valueOF(String) converts any month name into an integer. */
			MonthCalculation(Month.valueOf(month.toUpperCase()).getValue());

		}
		else 
		{
			/*Integer.parseInt converts any object into an integer*/
			MonthCalculation(Integer.parseInt(month));
		}
		
	}
	public static void MonthCalculation(int month_number)
	{
		int days_month = 0;
		int year = 0;	

		Scanner in = new Scanner(System.in);

		System.out.println("introduce the year");
		year = in.nextInt();

		switch(month_number)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days_month = 31;

		case 4: case 6: case 9: case 11:
			days_month = 30;

		case 2:
			if ((Leap_year(year)) == true) 
			{
				days_month = 29;
			}
			else 
			{
				days_month = 28;
			}
		default:
		}
		System.out.println("There are " + days_month + " days");
	}

}

	
	


