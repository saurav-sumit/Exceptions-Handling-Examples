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
public class TryInsideCatchExample {
 public static void main(String args[]) {
        System.out.println("main starts ...");
        try {
            int i = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString() + ": catch 1");
            try {
                int j = 10 / 0;
            } catch (ArithmeticException ex) {
                System.out.println(ex.toString() + ": catch 2");
            }
        }
        System.out.println("main ends ...");
    }
}
