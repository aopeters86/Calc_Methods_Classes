import java.util.Scanner;
public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner input = new Scanner(System.in);
//		would like to link input from user??//		
//		System.out.println("Enter an integer x");
//		int x = new input.nextInt();
//		System.out.println("Enter an integer y");
//		int y = new input.nextInt();
		
		
//		System.out.println();
//		print if calc is on or off???
//		System.out.print("Calculator 1 is " +calc1);
		
				
		Calc calc1 = new Calc(); 
//		print if calc is on or off???
//		System.out.print("Calculator 1 is " +calc1);
		System.out.println("Calculator 1 x and y sum = " + calc1.addCalc(1, 1));
		System.out.println("Calculator 1 x and y difference = " + calc1.subCalc(1, 2));
		System.out.println("Calculator 1 x and y quotient = " + calc1.divCalc(2, 3));
		System.out.println("Calculator 1 x and y product = " + calc1.multCalc(6, 15) + "\n");
		//print if calc is on or off???
		//System.out.print("Calculator 1 is " +calc1);

		Calc calc2 = new Calc(); 
//	print if calc is on or off???
//	System.out.print("Calculator 1 is " +calc1);
		System.out.println("Calculator 2 x and y sum = " + calc2.addCalc(25, 56));
		System.out.println("Calculator 2 x and y difference = " + calc2.subCalc(11, 2));
		System.out.println("Calculator 2 x and y quotient = " + calc2.divCalc(2, -3));
		System.out.println("Calculator 2 x and y product = " + calc2.multCalc(12, 15));
		
	}
	
	
}

//		System.out.println("Addition, input x");
//		int x = new input.nextInt();
//		System.out.println();