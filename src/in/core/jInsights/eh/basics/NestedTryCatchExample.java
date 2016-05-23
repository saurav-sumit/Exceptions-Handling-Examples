package in.core.jInsights.eh.basics;

public class NestedTryCatchExample {

    public static void main(String[] args) {
        System.out.println("main statrt .....");
        try {
            try {
                int k = 90 / 0;
            } catch (ArithmeticException ex1) {
                System.out.println("catch1" + ex1.getMessage());
            }
            int i = 10 / 0;

            System.out.println("try");
        } catch (ArithmeticException ex) {

            System.out.println("catch2" + ex.getMessage());
        }
        System.out.println("main ends ......");
    }
}
