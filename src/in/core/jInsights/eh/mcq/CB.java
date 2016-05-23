
package in.core.jInsights.eh.mcq;


public class CB {

    public static void main(String[] args) {
        try {
            f();
        } catch (NullPointerException ie) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }
        System.out.println("5");
    }

    public static void f() throws InterruptedException {
        throw new InterruptedException("its lunch time ");
    }
}
