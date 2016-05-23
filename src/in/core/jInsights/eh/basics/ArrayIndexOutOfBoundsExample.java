package in.core.jInsights.eh.basics;

public class ArrayIndexOutOfBoundsExample {

    public static void main(String args[]) {

        int a[] = new int[10];
        try {
            a[11] = 9;
            // a[1]=100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        a[1] = 100;
        System.out.println("a[1] = " + a[1]);

    }
}
