/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.core.jInsights.eh.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sumit kumar saurav<sumitk@cdac.in>
 *
 */
public class CheckedExceptionExample {

    public static void main(String[] args) {
        File f = new File("F:\\ACTS\\test");
        try {
            FileReader fr = new FileReader(f);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CheckedExceptionExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
