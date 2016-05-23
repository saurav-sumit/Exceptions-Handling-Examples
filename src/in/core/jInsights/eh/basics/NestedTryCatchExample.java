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
public class NestedTryCatchExample {

    public static void main(String[] args) {
        System.out.println("main statrt .....");
        try {
            try {
                int k = 90 / 0;
            } catch (ArithmeticException ex1) {
                System.out.println("catch1" +ex1.getMessage());
            }
            int i = 10 / 0;

            System.out.println("try");
        } catch (ArithmeticException ex) {

            System.out.println("catch2" +ex.getMessage());
        }
        System.out.println("main ends ......");
    }
}
