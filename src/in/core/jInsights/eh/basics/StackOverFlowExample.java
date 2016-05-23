
package in.core.jInsights.eh.basics;

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
