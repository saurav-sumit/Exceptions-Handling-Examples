package in.core.jInsights.eh.java7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
