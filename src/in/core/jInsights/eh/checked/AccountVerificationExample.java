
package in.core.jInsights.eh.checked;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountVerificationExample {

    private String cid;

    public static void validate(String cid) throws CustomerNotFoundException  {
        if (cid.length() < 5) {
            throw new CustomerNotFoundException(cid);
        } else {
            System.out.println("Customer Account Verified ... Welcome to the Bank");
        }
    }

    public static void main(String args[]) {
        try {
            validate("CDAC");
        } catch (CustomerNotFoundException ex) {
            Logger.getLogger(AccountVerificationExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


