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
public class UncaughtExceptionExample {

    public static void main(String args[]) {

        System.out.println("main method start ...");
        int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println("main method ends ...");
    }
}
