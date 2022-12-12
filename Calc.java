
//simple calc using mehods and classes, non void return types 
//and can make multiple calculators from same class.

public class Calc {
	//declare variables
	int x = 0;//defaults 
	int y = 0;//defaults

//	add(1, 2);
	
	//calculator off
	boolean calcOn = false;
	
	public Calc() {
	}
	
	// how to show if its off or on?
	public void turnCalcOn(){
		
		calcOn = true; // void method is on
	}
	// how to show if its off or on?
	public void turnCalcOff() {
		calcOn = false; // void method is off
	}
	
	
	public int addCalc(int x, int y ) {
		 return x + y;
	}
	
	//non negative number
	public int subCalc(int x, int y){
		return x - y;
	
		
	}
//	
//	public void multCalc() {
//		
//	}
//	
	public int divCalc(int x, int y){
		if(y != 0) {
		return x / y;
		}
		else
			return "can't divide by 0";
	}

}

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	
//}