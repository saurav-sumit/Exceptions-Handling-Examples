/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package in.core.jInsights.eh.basics;

/**
 *
 * @author sumit kumar saurav<sumitk@cdac.in>
    
 */
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
