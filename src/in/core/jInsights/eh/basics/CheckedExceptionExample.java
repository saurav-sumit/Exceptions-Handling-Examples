package in.core.jInsights.eh.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CheckedExceptionExample {

    public static void main(String[] args) {
        File f = new File("F:\\test");
        try {
            FileReader fr = new FileReader(f);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CheckedExceptionExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
