
package in.core.jInsights.eh.basics;


public class ThrowExample {

	public static void main(String[] args) {
		m1(10);
	}
	
	public static void m1(int x){
		
		try{
		if(x<100){
			throw new ArithmeticException("x<100");
		}
		}catch(ArithmeticException e){
			System.out.println(" 1 "+ e.getMessage());
		}
	}
}
