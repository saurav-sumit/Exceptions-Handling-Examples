/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.core.jInsights.eh.unchecked;

/**
 *
 * @author sumit kumar saurav<sumitk@cdac.in>
 *
 */
public class InvalidAccountException extends RuntimeException {

    String cid;
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InvalidAccountException(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "InvalidAccountException [" + cid + "]";
    }

}
