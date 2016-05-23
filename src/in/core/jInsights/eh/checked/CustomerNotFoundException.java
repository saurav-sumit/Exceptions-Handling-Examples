/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.core.jInsights.eh.checked;

/**
 *
 * @author sumit kumar saurav<sumitk@cdac.in>
 *
 */
public class CustomerNotFoundException extends Exception{
    
    private String cid; 

    public CustomerNotFoundException(String cid) {
        super();
        this.cid=cid;
    }
    @Override
   public String toString(){
        return "CustomerNotFoundException[ cid="+ cid + " ]";
       
   } 
    
    
    
    
}
