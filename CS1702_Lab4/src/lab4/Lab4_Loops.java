package lab4;

import java.util.Scanner;

public final class Lab4_Loops {

	
	static public void main(String args[])
		{
		
			Scanner in = new Scanner(System.in);

			System.out.println("1) 4.3 Condition and Loops");
			System.out.println("2) 4.4 Generating Sequences Using For loops");
			System.out.println("3) 4.5 Generating Patterns Using For Loops");
			System.out.println("4) 4.6 While Loops");
			System.out.println("5) 4.7 Nested Loops");
			System.out.println("  6) Nested loops that perform the following tasks");
			System.out.println("Choose a section");
			int section = 0;
			section = in.nextInt();

			switch (section)
			{	
			case 1:
				Conditions_and_loops();
			case 2:
				Generating_Sequences_using_for_loops();
			case 3:
				Generating_Patterns_Using_For_Loops();
			case 4: 
				While_Loops();
			case 5:
				Nested_Loops();
			case 6: 
				More_nested_loops();
			default:
				break;
			}	
	}
	public static void Conditions_and_loops()
	{	
		
		for (int a = 0 ; a<=1000 ; ++a ){
			if (a > 0) {
				if ((a % 2 == 0) && (a % 3 == 0)){
					System.out.println(a +" is divisible by 2 and 3");
				}else{
					System.out.println(a +" is not divisible by 2 and 3");
				}
			}

		if ((a % 7 == 0) || (a % 9 == 0)) {
			System.out.println(a + " is divisble by 7 or 9");
		}
		else
		{
			System.out.println(a + " is not divisble by 7 or 9");
		}
		if ((a % 2 == 0) && (a % 3 == 0) && (a % 5 != 0)){
			System.out.println(a + " is divisible by 2 and 3 but not 5");
		}
		else
		{
			System.out.println(a + " is not divisible by 2 and 3 but not 5");
		}

		}
	
}
	public static void Generating_Sequences_using_for_loops()
	{

		int i;

		//1)
		System.out.println("1)");
		for(i=4;i<12;++i)
		{
			System.out.print(i + ", ");
		}
		
		//2)
	
		System.out.println("\n" + "2)");
		for(i=10;i<20;i+=3)
		{
			System.out.print(i + " ,");
		}
		//3)
		System.out.println("\n" + "3)");
		for(i=1;i<17;i+=3)
		{
			System.out.print(i + " ,");
		}
		//4)
		System.out.println("\n" + "4)");
		for(i=2;i<13;i+=2)
		{
			System.out.print(i + " ,");
		}
		//5)
		System.out.println("\n" + "5)");
		for(i=1;i<101;i++)
		{

			System.out.print((Math.pow(i, 2)+ " ,"));
		}
		//6)
		System.out.println("\n" + "6)");
		for(i=-10;i<=10;i+=2)
		{
			System.out.print(i +" ,");
		}
		//7)
		System.out.println("\n" + "7)");
		for(i=-20;i<=20;i+=5)
		{
			System.out.print(i +" ,");
		}


		
		
}
	public static void Generating_Patterns_Using_For_Loops()
	{
		
		int i;
        //1)
		System.out.println("1)");
		for(i=0;i<10;++i)
		{
			System.out.print("+");
		}
		//2)
		System.out.println("\n 2)");
		for(i=0;i<9;++i)
		{
			System.out.print("-");
		}
		//3)
		System.out.println("\n 3)");
		for(i=0;i<5;++i)
		{
			System.out.print("+-");
		}
		//4)
		System.out.println("\n 4)");
		for(i=0;i<3;++i)
		{
			System.out.print("*+-");
		}
		//5)
		System.out.println("\n 5)");
		for(i=0;i<3;++i)
		{
			System.out.print("*");
			System.out.print("+");
			System.out.print("-");
		}
		System.out.print("*");	
		//6)
		System.out.println("\n 6)");
		for(i=0;i<3;++i)
		{
			System.out.print("**++");
		}
		//7)
		System.out.println("\n 7)");
		for(i=0;i<2;++i)
		{
			System.out.print("***+++---");
		}
		//8)
		System.out.println("\n 8)");
		for(i=0;i<1;++i)
		{
			System.out.print("***+++---");
			for (int a=0;a<1;++a)
			{
				System.out.println("---+++***");
			}
		}

	
	}
	public static void While_Loops()
{
	
		
	
	int a;
	int b;
	int c;
	
		Scanner in = new Scanner(System.in);
			
		System.out.println("First Number");
		a = in.nextInt();
		System.out.println("Second Number");
		b = in.nextInt();
		
		c = a %b;
		while (c > 0){
		a = b;
		b = c; 
		c = a % b;
		
		}
			System.out.println("the HCF " + b);
			
			
		
	
	
}	
	public static void Nested_Loops()
	{
		int i,j;
		//1 
		System.out.println("1)");
		for(i=1;i<6;++i)
		{
			for(j=1;j<i+1;++j)
			{
				System.out.print(i);
			}
		}

		//2
		System.out.println("\n2)");
		for(i=2;i<7;++i)
		{
			for(j=1;j<i+1;++j)
			{
				System.out.print(i);
			}
		}
		
		//3
		System.out.println("\n3)");
		for(i=1;i<6;i+=2)
		{
			for(j=1;j<i+1;++j)
			{
				System.out.print(i);
			}
		}
		//4
		System.out.println("\n4)");
		for(i=1;i<8;i+=2)
		{
			for(j=1;j<i+1;j+=2)
			{
				System.out.print(i);
			}
		}
		
		//5
		System.out.println("\n5)");
		for(i=5;i>=1;--i)
		{
			for(j=1;j<i+1;j++)
			{
				System.out.print(i);
			}
		}
		
		//6
		System.out.println("\n6)");
		for(i=5;i>=1;--i)
		{
			for(j=5;1+j>i;j--)
			{
				System.out.print(i);
			}
		}
		
		//7
		System.out.println("\n7)");
		for(i=1;i<6;i+=2)
		{
	
			for(j=1;j<i+1;j++)
			{
				System.out.print("+");
			}
			
			if (i < 5){
				for(j=1;j<i+2;j++)
				{
					System.out.print("*");
				}
			}
			else{
				
			}
				
			
		}
		
		//8
		System.out.println("\n8)");
		for(i=1;i<6;i+=3)
		{
			for(j=1;j<i+2;j++)
			{
				System.out.print("-");
			}
			for(j=1;j<i+3;++j)
			{
				System.out.print("*");
			}
			for(j=1;j<i+4;++j)
			{
				System.out.print("+");
			}
		
		}
	
	
	
	}
	static public void More_nested_loops()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\n1)Display all of the possible pairs of numbers between 1 and 10 ");
		System.out.println("2)Display all possible pairs in the form x, y where x < y and 0 < x, y < 11");
		System.out.println("3)Display all possible pairs of the numbers 1,2,3,4 paired with 4,5,6,7,8");
		System.out.println("Choose a section");
		
		
		int section = 0;
		section = in.nextInt();

		switch (section)
		{	
		case 1:
			System.out.println("Display all of the possible pairs of numbers between 1 and 10");
			
			for (int i=1;i<=10;i++)
			{
				System.out.println();
				for (int j=1;j<=10;j++)
				{
					System.out.print(" | "+i+","+j);
				}
			}
			
			System.out.println("\n");
			break;
		case 2:
			System.out.println("\nDisplay all possible pairs in the form x, y where x < y and 0 < x, y < 11");
			
			for (int x=1;x<11;x++)
			{
				System.out.println();
				for (int y=2;y<11;y++)
				{
					if (x<y)
					{
						System.out.print(x+","+y+" | ");
					}
					else{
					}
				}
			}
			
			System.out.println("\n");
			break;
		case 3:
			System.out.println("\nDisplay all possible pairs of the numbers 1,2,3,4 paired with 4,5,6,7,8");
			
			for (int v=1;v<5;v++)
			{
				System.out.println();
				for ( int b=4;b<9;b++)
				{
					System.out.print(v+","+b+" | ");
				}
			}
			
			System.out.println("\n");
			break;
		default:
			break;
		}	


	}

}
