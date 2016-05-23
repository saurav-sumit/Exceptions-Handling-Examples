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
public class DivideByZeroExample {

    public static void main(String args[]) {
        System.out.println("main start");
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            if (b == 0) {
                System.out.println("value of b = " + b);
                throw new ArithmeticException("Value of b=0");
            } else {
                int i = a / b;
                System.out.println("Result : " + i);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Number Format :" + nfe.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("Airthmatic : " + ae.getMessage());
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("ArrayIndex : " + aie.getMessage());
        } catch (Exception e) {
            System.out.println(" catch in ");
        }
        System.out.println("main end ");

    }
}
