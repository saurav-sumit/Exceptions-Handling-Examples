/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.core.jInsights.eh.basics;

/**
 *
 * @author sumit kumar saurav<sumitk@cdac.in>
 *
 */
public class StackOverFlowExample {
    
    public static void main(String args[]){
        
        try{
        main(null);
        }catch(Throwable e){
            e.printStackTrace();
        }
       
        System.out.println("main");
       
    }
    
}
