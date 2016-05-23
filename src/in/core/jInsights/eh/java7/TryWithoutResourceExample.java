package in.core.jInsights.eh.java7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
