/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package in.core.jInsights.eh.basics;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author sumit kumar saurav<sumitk@cdac.in>
    
 */

class A{
    public static void m1() throws  IOException,SQLException{
        System.out.println("A --m1");
    }
}

class B extends A{
    public static void m1() throws IOException {
         System.out.println("B --m1");
    }
}
public class OverridingException {

    public static void main(String[] args) throws Exception
    {
        A b = new B();
        b.m1();
    }
}
