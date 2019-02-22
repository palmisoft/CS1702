package lab2;


public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment_and_expressions();
		Formulas();
	
	}
	public static void Assignment_and_expressions()
	{
		
		double x;
		
		x = 100.1;
		System.out.println(x);
		x = x + 10.2; //Line A
		System.out.println(x);
		x = x + 20.3; //Line B
		System.out.println(x);
	
	
	}
	public static void Formulas()
	{
		
		int a=100, g=0;
		long x;
		double y, b=2.3, c=-52.2, pi=3.142;
		boolean d=true;
		String z, e="I am ", f=" a student", h="!", name="Mario";
		
		
		y=a+b;
		System.out.println("1)" +y);

		y = a + b;
		System.out.println("2)" +y);

		z = e + f;
		System.out.println("3)" +z);

		y=b*c;
		System.out.println("4)" +y);

		pi=22.0/7;
		System.out.println("5)" +pi);

		/*A string can not be divided by an integer*/
		//z=name/g;
		System.out.println("6)" + "ERROR");

		/*A number can not be divided by 0*/
		//z=c/g;
		System.out.println("7)" +"ERROR");

		x=10;
		x=x^3;
		System.out.println("8)" +x);

		z=name+ " is" +f+h;
		System.out.println("9)" +z);

		/*Strings cannot be added up to numbers*/
		//y=(name+10)/(name+h);
		System.out.println("10)" +"ERROR");		

		/*Boolean data cannot be added up to a number*/
		//x=(a+b)/(d+c);
		System.out.println("11)" +"ERROR");		

		y=100.3;
		y=(y/(a+b))-c;
		System.out.println("12)" +y);

		/*The square root of a string cannot be calculated */
		//x*x=math.sqrt(y)+Math.sqrt(z);
		System.out.println("13)" +"ERROR");

		/*Strings cannot be treated as integers therefore they must not be used in formulas */
		//name="Is " + f - h;
		System.out.println("14)" +name);

		y=((pi+1)/(pi+2))/(pi+3);
		System.out.println("15)" +y);

		y =-2;
		y=Math.cbrt((Math.sqrt(y)/b));
		System.out.println("16)" +y);

		/*Any number cannot be divided by zero*/
		//y=b/g
		System.out.println("17)" +"ERROR");

		z=y+name;
		z=name;
		z=b/g+z;
		System.out.println("18)" +z);

		y=-2.3;
		y=(a*(Math.sqrt(y)))+(b*y)+c;
		System.out.println("19)" +y);

		/*Due to the fact that d is boolean, the formula will not work*/
		//y=y-Math.pow((a-b), Math.pow((b-c),(c-d)));
		System.out.println("20)" +"ERROR");

	}

	
		
		
	
	
	
	
			
	}


