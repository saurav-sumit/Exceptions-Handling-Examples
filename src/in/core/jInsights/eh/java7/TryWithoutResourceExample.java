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
public class TryWithoutResourceExample {

    public static void main(String args[]) {

        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader("/home/superusr/test"));
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("IO" + e.getMessage());
        }

    }

}
