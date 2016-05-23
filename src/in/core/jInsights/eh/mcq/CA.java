/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package in.core.jInsights.eh.mcq;

/**
 *
 * @author sumit kumar saurav<sumitk@cdac.in>
    
 */
public class CA {
    public static void main(String[] args) {
        int k=0;
        try{
        int i=5/k;
        }catch(ArithmeticException  e){
            System.out.println("1");
        }catch(RuntimeException e){
            System.out.println("2");
        }catch(Exception e){
             System.out.println("3");
        }finally{
             System.out.println("4");
        }
         System.out.println("5");
    }

}
