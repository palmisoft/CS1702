package lab7;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;



public class CS1702_Lab7 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		System.out.println("1) 7.3 Strings");
		System.out.println("2) 7.4 Mathematical Functions");
		System.out.println("3) 7.5 System Commands");
		System.out.println("4) 7.6 Random Number Generation");
		System.out.println("5) 7.7.1 File Handling: Reading Data");
		System.out.println("6) 7.7.2 File Handling: Writing Data");
		System.out.println("7) 7.8 Creating a JAR File");
		System.out.println("Choose a section");


		int section = 0;
		section = in.nextInt();

		/*This menu has been implemented to organise the subclasses so 
		 * then the user can run a desired section without executing all of it  */
		switch (section)
		{	
		case 1:
			strings();
			break;
		case 2:
			mathematical_functions();
			break;
		case 3:
			system_commands();
		case 4:
			random_number_generation();
		case 5:
			Reading_data();
		case 6:
			Writing_data();
		case 7:
			Creating_a_JAR_file();
		default:
			main(null);
			break;
		}
		
		main(null);

	}
	public static void strings()
	{

		double number = 1.0/3.0;

		DecimalFormat number_format = new DecimalFormat("#.##");
		System.out.println(number);
		String formatted_string = number_format.format(number);
		System.out.println(formatted_string);


		double x = 123.456, y = 17.0/3.0, z = Math.sqrt(2);
		String a ="Hello", b = "World";

		//__1__///////////////////////////////////////////////////
		System.out.println("\n1) Display y to three decimal places");

		DecimalFormat y_format = new DecimalFormat("#.###");
		String formatted_y = y_format.format(y);
		System.out.println("y = "+formatted_y);		

		//__2__///////////////////////////////////////////////////
		System.out.println("\n2) Display how many digits come before the decimal point and how many comes after a number."
				+ "\n  Test this program on x, y and z");


		/*All variables have been named String_temp or String_form to easily re-use code*/


		/*Before the decimal place*/
		String string_temp0 = new Double (x).toString();
		/*public String substring(int beginIndex,int endIndex).This show character in a string found in the range given, 
		 * for example, Company(1,5) would return "ompa". In this case as we dont know where the dot is positioned,
		 * indexOF() has been implemented to find where the dot is*/
		String string_form0 = string_temp0.substring(0, string_temp0.indexOf('.'));
		

		/*after the decimal place*/
		String string_temp2 = new Double (x).toString();
		/*public String.substring(int beginIndex,int endIndex).
		 * On the other hand in this method the starting point is the dot and there is no end but the length of the number(String_temp2.length()) */
		String string_form2 = string_temp2.substring(string_temp2.indexOf('.'), string_temp2.length());
		
		
		System.out.println("\nx = "+string_form0);
		System.out.println(string_form0.length()+" digits after the decimal place");
		System.out.println("x = "+string_form2);
		System.out.println(string_form2.length()-1 + " digits before the decimal place");
		
		
		
		//Before
		String string_temp3 = new Double (y).toString();
		String string_form3 = string_temp3.substring(0, string_temp3.indexOf('.'));
		
		//After
		String string_temp4 = new Double (y).toString();
		String string_form4 = string_temp4.substring(string_temp4.indexOf('.'), string_temp4.length());

		System.out.println("\ny = "+string_form3);
		System.out.println(string_form3.length()+" digit after the decimal place");
		System.out.println("y = "+string_form4);
		System.out.println(string_form4.length()-1 + " digits before the decimal place");

		//Before
		String string_temp5 = new Double (z).toString();
		String string_form5 = string_temp5.substring(0, string_temp5.indexOf('.'));
		
		//After
		String string_temp6 = new Double (z).toString();
		String string_form6 = string_temp6.substring(string_temp6.indexOf('.'), string_temp6.length());
		
		System.out.println("\nz = "+string_form5);
		System.out.println(string_form5.length()+" digit after the decimal place");
		System.out.println("z = "+string_form6);
		System.out.println(string_form6.length()-1 + " digits before the decimal place");
		
		//__3__///////////////////////////////////////////////////
		System.out.println("\n3) Create a string c that consists of a in reverse concatenated with b, including a space between them ");

		/*String a and b have been converted using StringBuilder to an object that will be altered onwards.
		 * The new variable has been named br and ar (r from reverse)*/
		StringBuilder ar = new StringBuilder(a);
		StringBuilder br = new StringBuilder(b);
		/*The method poublic string.reverse() will place the word backward.Moreover the space has been added just using normal text*/
		
		String c1 = ar + " " +br.reverse() ;
		
		
		System.out.println("\n"+c1);

		//__4__///////////////////////////////////////////////////
		System.out.println("\n4) Search for the substring ‘ll’ in c and replace it for ‘ppp’");
		/*public String replace(old , new). This replaces the chart in old for the one in new */
		String c2 = c1.replace("ll", "ppp");
		System.out.println("\n"+c2);
		
		
		
	}
	public static void mathematical_functions()
	{
		RoundingTest(10.2);



		Scanner in = new Scanner(System.in);


		/*As a shortcut the methods in.nextInt and in.nextDouble have been implemented. 
		 * In this case the user will have the ability to introduce any of the numbers given*/
		System.out.println("introduce an integer");
		int a = 0;
		a = in.nextInt();
		System.out.println("introduce any of these numbers :"
				+ "\n-100.1,  100.49,  100.5, -100.51, -100.9, 100.1, 100.49, 100.5, 100.51, 100.9. ");
		double b = 0;
		b = in.nextDouble();

		/*%2 second parameter  
		 * %1 First parameter 
		 * $.2f means round up on the second decimal place
		 * $d form an integer*/

		String s = String.format("b = %2$.2f a = %1$d",a,b);
		System.out.println("\n"+s);
	
	}
	private static void RoundingTest(double x) 
	{

		System.out.println(x);	
		System.out.println("ceil: " + Math.ceil(x));
		System.out.println("floor: " + Math.floor(x));
		System.out.println("round: " + Math.round(x));

	}
	public static void system_commands()
	{
		/*Anew object is created from dir_name which is dir*/
		String dir_name = "h:\\";
		File dir = new File(dir_name);

		/*This will return the list of flies and folders in a certain directory*/
		File[] dir_list = dir.listFiles();
		/*the length of the directory list has been measured to give a size to the loop*/
		for(int i=0;i<dir_list.length;++i)
		{
			System.out.println(dir_list[i].getName());

			/*This statement has been implemented to separate files from folders
			 *This method already intercepts directories( folders ) */
			if (dir_list[i].isDirectory())
			{
				System.out.println("Is directory");
			}
			/*The rest are files.*/
			else 
			{
				System.out.println("Is File");
				/*The variable dor ,created from the dir_list with size i, 
				 * contains everything that comes after the dot  .indexOf(".") */
				int dot = dir_list[i].getName().indexOf(".");

				System.out.println(dir_list[i].getName().substring(dot));

			}

		}

	}
	public static void random_number_generation()
	{

		Scanner in = new Scanner(System.in);


		System.out.println("1) Generate random integers between -100 and +100");
		Random rand= new Random();
		/*There are many form of displaying random numbers within two given values
		 * In this specific method the limits must be set first*/
		int Low = -100, High = +100;
		for(int i=0;i<10;++i)
		{
			/*This line of code will generate the random numbers between the two given values,
			 *  lower bound inclusive ( included ) but not the higher.  */
			int result = rand.nextInt(High-Low)+Low;
			System.out.print(result+", ");
		}

		System.out.println("2) Generate random integers between limits (pre-specified) a and b");
		/*input values by the user*/

		int rangeHigh0, rangeLow0 = 0;
		System.out.println("introduce the High limit");
		rangeHigh0 = in.nextInt();
		System.out.println("introduce the Low limit");
		rangeLow0 = in.nextInt();

		/*same procedure as before but using the input values*/
		for(int i=0;i<10;++i)
		{
			/*This line of code will generate the random numbers between the two given values,
			 *  lower bound inclusive ( included ) but not the higher.  */
			int result = rand.nextInt(rangeHigh0-rangeLow0)+rangeLow0;
			System.out.print(result+", ");
		}

		System.out.println("\n3) Generate random doubles");
		Random rand_double0 = new Random();
		for(int i=0;i<10;++i)
		{
			/*same procedure as in exercise 2 and 1 but changing nextInt() for nextDouble()*/
			System.out.println(rand_double0.nextDouble());
		}

		System.out.println("4) Generate random doubles between zero and one");

		int rangeLow1 = 0, rangeHigh1 = 1;

		Random rand_double1 = new Random();

		for(int i=0;i<10;++i)
		{
			/*Following the formula found on the second exercise  but multiplying by rand_double1.nextDouble() */
			double randomValue1 = rangeLow1 + (rangeHigh1 - rangeLow1) * rand_double1.nextDouble();

			/*this method has been extracted from the string area at the the top of this java project*/
			DecimalFormat value_format1 = new DecimalFormat("#.###");
			String randomValue_formated1 = value_format1.format(randomValue1);
			System.out.println(randomValue_formated1);
		}


		System.out.println("5) Generate random doubles between limits (pre-specified) a and b");


		double rangeLow2, rangeHigh2 = 0;
		System.out.println("introduce the Higher number (it can contain decimals)");
		rangeHigh2 = in.nextDouble();
		System.out.println("introduce the lower number (it can contain decimals)");
		rangeLow2 = in.nextDouble(); 

		Random rand_double2 = new Random();


		if (rangeHigh2 > rangeLow2)
		{
			for(int i=0;i<10;++i)
			{
				/*Following the formula found on the second exercise  but multiplying by rand_double1.nextDouble() */
				double randomValue2 = rangeLow2 + (rangeHigh2 - rangeLow2) * rand_double2.nextDouble();

				/*this method has been extracted from the string area at the the top of this java project*/
				DecimalFormat value_format2 = new DecimalFormat("#.###");
				String randomValue_formated2 = value_format2.format(randomValue2);
				System.out.println(randomValue_formated2);
			}
		}
		else 
		{
			System.out.println("the higher bound is lower than the low bound, please reintroduce de data again");	

		}

	}
	public static void Reading_data() throws IOException
	{
		int count = 0;

		FileReader readhandle = new FileReader ("H:\\My course\\YEAR 1\\Programming\\Billy Goats.txt");
		BufferedReader br = new BufferedReader (readhandle);
		String line = br.readLine();

		/*This line of code will analyse the file to find content in it. 
		 * While the words contain in line are not equal to null or zero then apply the following loop */
		while (line != null )
		{
			/*this method will create a list of words*/
			String []parts = line.split(" ");
			/*The loop below reads as “word in parts.” will count how many lines 
			 * are in the list of words created previously in "parts" */
			for (String word : parts)
			{
				count++;
			}	
			
			line = br.readLine();
		}
		
		System.out.println("The document has " + count);
		br.close();
		readhandle.close();
	}
	public static void 	Writing_data() throws IOException 
	{
	
	Scanner in = new Scanner(System.in);
	System.out.println("introduce a number");
	
	int n = 0;
	n = in.nextInt();
	
	/*This method open a file for writing*/
	FileWriter writehandle = new FileWriter ("H:\\My course\\YEAR 1\\Programming\\Matrix.txt");
	/*This creates a buffered writer*/
	BufferedWriter bw = new BufferedWriter(writehandle);
	
	/*This loop runs 1 to "n" times.*/
	for ( int i = 1; i <= n ; i++)
	{
		/*this will apply a square root to every "i" number*/
		double number = Math.sqrt(i);	
		
		/*This gives its user complete control over rounding behaviour being able to 
		 * approximate numbers using a variable. 
		 * "ROUND_HALF_UP" round towards "nearest neighbour" unless both neighbours are equidistant, in which case round up */
		BigDecimal bd = new BigDecimal(number).setScale(i, BigDecimal.ROUND_HALF_UP);
		
		/*the number formated has to be converted into string to be wirtten into the document.
		 * For this the toString() has been applied.  */
		bw.write(bd.toString());
		bw.newLine();
	}
	bw.close();
	writehandle.close();
		
		
	}
	public static void Creating_a_JAR_file()
{
	JAR_Example je = new JAR_Example();
}
}


