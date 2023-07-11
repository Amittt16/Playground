package Factory;

public class CustomerFacade implements ClientFacade{
    @Override
    public CustomerFacade login(String use , String password) {
        return this;
    }

    @Override
    public String toString() {
        return "CustomerFacade";
    }
}
