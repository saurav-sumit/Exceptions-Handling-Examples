/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.core.jInsights.eh.java7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author sumit kumar saurav<sumitk@cdac.in>
 *
 */
public class TryWithResourceExample {

    public static void main(String args[]) {
        // Any object implements java.lang.AutoCloseable or java.io.Closeable can be passed to try block as resources 
        try (BufferedReader br = new BufferedReader(new FileReader("/home/superusr/test"))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
