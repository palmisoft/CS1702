package lab3;

import java.util.Scanner;
import java.util.Arrays;

public class Lab3_Conditional_Statements {

	static public void main(String args[])
	{

		Scanner in = new Scanner(System.in);

		System.out.println("1) 3.2 Relational operations");
		System.out.println("2) 3.3 Designing if statements");
		System.out.println("3) 3.4 Compound condition");
		System.out.println("4) 3.5 Using switch Statements");
		System.out.println("select a section");
		int section = 0;
		section = in.nextInt();

		switch (section)
		{	
		case 1:
			Relational_opperators();
		case 2:
			Designing_if_Statements();
		case 3:
			Compound_conditions();
		case 4: 
			Switch_statements();
		default:
			break;
		}





		//The_?:_notation();
	}
	public static void Relational_opperators()
	{
		System.out.println("3.2 Relational operators");

		int x=100, y=204, c=-204;
		double z=-23.1;
		boolean a=true,b=false;






		if (x<y){
			System.out.println("1) x<y is true");
		}else {
			System.out.println("1) x<y false");
		}


		if (x>z && a==b){
			System.out.println("2) x>z and a=b true");
		}else{
			System.out.println("2) x>z and a=b false");
		}


		if ((2*c)>y){
			System.out.println("3) 2*c>y is true");
		}else{
			System.out.println("3) 2*c>y is false");
		}

		// X is an integer and b boolean therefore it can not be calculated
		/*if (x==b){
		System.out.println();
	}else {
		System.out.println();
	}*/
		System.out.println("4) ERROR");

		if (c != y || c == y){
			System.out.println("5) c!=y or c=y is True");
		}else{
			System.out.println("5) c!=y or c=y is false");
		}

		// c is an integer and a boolean therefore it can not be calculated
		/*if (z != y && c == a) {
		System.out.println();
	}else {
		System.out.println();
	}*/
		System.out.println("6) ERROR");

		// a is boolean therefore it can not be calculated
		/*if (y >=y && (a+3)!=2) {
		System.out.println();
	}else {
		System.out.println();
	}*/
		System.out.println("7) ERROR");
	}

	public static void Designing_if_Statements()
	{
		System.out.println("3.3 Designing if Statements");

		int a,b,c;

		Scanner in = new Scanner(System.in);
		//TODO learn more about how scanner command works 
		System.out.println("introduce first number");
		a = in.nextInt();
		System.out.println("introduce second number");
		b = in.nextInt();
		System.out.println("introduce third number");
		c=in.nextInt();

		if (a<b && a<c){
			System.out.println(a);

			if (b<c){
				System.out.println(b);
				System.out.println(c);
			}else{
				System.out.println(c);
				System.out.println(b);
			}
		}else if(b<a && b<c){
			System.out.println(b);
			if (a<c){
				System.out.println(a);
				System.out.println(c);
			}
			else{
				System.out.println(c);
				System.out.println(a);
			}
		}
		else{
			System.out.println(c);
			if (b<a){
				System.out.println(b);
				System.out.println(a);
			}
			else{
				System.out.println(a);
				System.out.println(b);
			}
		}

		//TODO finish this part 
		String name1="mario", name2="palmis",name3="solano";

		System.out.println((name1.compareTo(name2)));
		System.out.println((name1.compareTo(name3)));
		System.out.println(name1.compareTo(name1));

	}



	public static void Compound_conditions()
	{
		int a;
		System.out.println("introduce a number more than 0");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();

		if (a > 0) {
			if ((a % 2 == 0) && (a % 3 == 0)){
				System.out.println(a +" is divisible by 2 and 3");
			}else{
				System.out.println(a +" is not divisible by 2 and 3");
			}
		}

		if ((a % 7 == 0) || (a % 9 == 0)) {
			System.out.println(a + " is divisble by 7 or 9");

		}else{
			System.out.println(a + " is not divisble by 7 or 9");
		}

		if ((a % 2 == 0) && (a % 3 == 0) && (a % 5 != 0)){
			System.out.println(a + " is divisible by 2 and 3 but not 5");
		}else{
			System.out.println(a + " is not divisible by 2 and 3 but not 5");
		}


	}
	public static void Switch_statements()
	{
		int daysinmonth = 0;
		String month = "September";

		switch (month)
		{
		case "January": case "March": case "May": case "July": case "August": case "October": case "December":
			daysinmonth = 31;
			break;
		case "February":
			daysinmonth = 28;
			break;     	
		case "April": case "June": case "September": case "November":
			daysinmonth = 30;
			break;    
		default: 
			daysinmonth = -1;
			break;
		}
		System.out.println("Days in month " + month + " = " + daysinmonth);

	}







}















