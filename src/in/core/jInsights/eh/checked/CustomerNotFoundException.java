package in.core.jinsights.eh.checked;

public class CustomerNotFoundException extends Exception {

    private String cid;

    public CustomerNotFoundException(String cid) {
        super();
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "CustomerNotFoundException[ cid=" + cid + " ]";

    }

}
