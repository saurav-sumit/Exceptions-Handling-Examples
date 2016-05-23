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
public class AccountVerification {

    String cid;

    public static void validate(String cid) {

        if (cid.length() < 5) {
            throw new InvalidAccountException(cid);
        }
    }

    public static void main(String[] args) {
        AccountVerification av = new AccountVerification();
        try {
            av.validate("A100");
        } catch (InvalidAccountException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
