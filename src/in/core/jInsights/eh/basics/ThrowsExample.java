
package in.core.jInsights.eh.basics;


import java.io.IOException;
import java.sql.SQLException;

public class ThrowsExample {

    public static void main(String[] args) {

        try {
            m2();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void m1() throws IOException, SQLException {
        System.out.println(" method m1");
    }

    public static void m2() throws IOException, SQLException {
        System.out.println(" method m2");
        m1();

    }
}
