/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.core.jInsights.eh.basics;

/**
 *
 * @author sumit kumar saurav<sumitk@cdac.in>
 *
 */
public class FinallyExample {

    public static void main(String args[]) {

        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Next line will not be executed if exception occure at previous ");
           // System.exit(0); 

        } catch (ArithmeticException e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("finally block has to execute ...irrespective of exception..");
        }
        System.out.println("done");
    }

}
