package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class CS1702_Lab5 {

	public static void main(String[] args) {
		
		/*This statement capture keyboard inputs*/
		Scanner in = new Scanner(System.in);

		System.out.println("1) 5.3 Using an ArrayList");
		System.out.println("2) 5.4 Casting ");
		System.out.println("3) 5.5 ArrayList Implementation Considerations");
		System.out.println("Choose a section");
		
		int section = 0;
		section = in.nextInt();
		
		/*This menu has been implemented to organise the subclasses so 
		 * then the user can run a desired section without executing all of it  */
		switch (section)
		{	
		case 1:
			using_an_arrayList();
		case 2:
			casting();
		case 3:
			arrayList_implementation_considerations();
		default:
			main(null);
			break;
		}		
	}	
 	public static void using_an_arrayList()
	{
		

		/*This is the example given in the work-sheet*/
		/*This method is used to add "data" to the array*/
		Data x0 = new Data("Fred",41);
		x0.Print();

		//TODO 
		/*
		 * The Following methods have been implemented to give two values (name, age) to 
		 * a variable x1, x2 or x3. This is due to data can be compounded of more than one constant.
		 */
		Data x1 = new Data ("Fred", 21);
		Data x2 = new Data ("Jo", 43);
		Data x3 = new Data ("Zoe", 37);
		
		/*
		 * This method introduces whatever value is added to array_list into "Data". 
		 * 
		 * */
		ArrayList<Data> array_list = new ArrayList<Data>();
		array_list.add(x1);
		array_list.add(x2);
		array_list.add(x3);

	
		/*this statement calls private static void PrintDataArray which could be found below*/
		PrintDataArray(array_list);
	
		/*This method has been implemented to go back to the main menu. 
		 * It can be found in every subclass*/
		System.out.println("\n");
		
		main(null);
	}
	public static void casting()
	{
		int x = 10;
		double y = x;
		System.out.println(y);

		/*
		double x = 10.3;
		int y = (int)x;
		System.out.println(y);
		 */

		Byte by = new Byte((byte) 255);
		
		Long v1 = (long) 10;
		Float v2 = (float) 10.3;
		
		
		
		System.out.println("\n");
		main(null);
	}
	public static void arrayList_implementation_considerations()
	{
		Data x1 = new Data ("Fred",21);
		Data x2 = new Data ("Jo", 43);
		Data x3 = new Data ("Zoe", 37);
		

		
		ArrayList<Data> ArrayA = new ArrayList<Data>();
		ArrayA.add(x1);
		ArrayA.add(x2);
		ArrayA.add(x3);
		
		ArrayList<Data> ArrayC = new ArrayList<Data>();
		ArrayC.add(x1);
		ArrayC.add(x2);
		ArrayC.add(x3);
		
		//Empty Array
		ArrayList<Data> ArrayD = new ArrayList<Data>();
		ArrayList<Data> ArrayB = new ArrayList<Data>();
		
		/* S U M  U P
		 * The following piece of code shows the difference between using : 
		 * - Array = Array: this method equals both arrays.
		 * Therefore any deletions or additions will be applied to the original array.
		 * - Array = Array.clone(): On the other hand, this statement 
		 * creates and independent array to which any modification will not affect the original array. . 
		 *   */
		
	
		/*ArrayA = ArrayB*/
        /////////////////////////////////////////////////////
		System.out.println("ArrayA = ArrayB");
		
		/*In this case it can be noticed how this statement will influence the following methods */
		ArrayB = ArrayA;
		ArrayB.remove(1);
		PrintDataArray(ArrayA);
		
		System.out.println();
		
		/*this statement equals ArrayA to ArrayB*/
	
		PrintDataArray(ArrayB);
		
		System.out.println();
		
		/*This statement removes the value 1 which means the second name
		 * due to the starting point is 0. It also alter the original array. 
		 * Hence ArrayB could alter ArrayA*/
		
		PrintDataArray(ArrayB);
		/////////////////////////////////////////////////////
	
		
		/*ArrayD = ArrayC.Clone*/
		/////////////////////////////////////////////////////
		System.out.println("\n\nArrayD = ArrayC.clone()");
		PrintDataArray(ArrayC);
		
		System.out.println();
		
		/*This creates an independent array. Any addition or deletion applied 
		 * will not affect the original array. Therefore, any number extracted 
		 * from ArrayD wont alter ArrayC*/
		ArrayD = (ArrayList<Data>)ArrayC.clone();
		ArrayD.remove(1);
		PrintDataArray(ArrayD);
		
		System.out.println();	
		/*This Array is displayed with no alteration*/
		PrintDataArray(ArrayC);
		System.out.println();
		/////////////////////////////////////////////////////
	
		System.out.println("\n");
		main(null);
		
	}
	private static void PrintDataArray(ArrayList<Data> array)
	{
		
		/*
		 * This loop has been implemented to print each value of the array.
		 * "array_list.size() determines the size of the loop using an integer.
		 * Each piece of data will be assigned a number 1,2,3... 
		 * following the order in which they have been introduced
		 * For example x1("Fred", 21) = 1.  
		 * 
		 * */
		
		for (int i=0;i<array.size();++i)
		{
			array.get(i).Print();

		}

	}

}

		
		
		
		
	
		
	
	
	


