package in.core.jInsights.eh.unchecked;

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
