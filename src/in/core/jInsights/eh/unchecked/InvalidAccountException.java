package in.core.jInsights.eh.unchecked;

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
