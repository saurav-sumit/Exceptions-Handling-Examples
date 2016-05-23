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
public class TryFinallyExample {

    public static void main(String[] args) {
        int sum = -1;
        int b = 10;
        try {
            if (sum < 0) {

            }

        } finally {
            if (sum > 0) {
                print(sum);
            }
        }

        System.out.println("exit main");
    }

    public static void print(int x) {
        System.out.println("x :" + x);
    }

}
