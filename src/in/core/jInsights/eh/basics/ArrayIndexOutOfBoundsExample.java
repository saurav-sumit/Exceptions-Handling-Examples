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
public class ArrayIndexOutOfBoundsExample {

    public static void main(String args[]) {

        int a[] = new int[10];
        try {
            a[11] = 9;
            // a[1]=100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        a[1] = 100;
        System.out.println("a[1] = " + a[1]);

    }
}
