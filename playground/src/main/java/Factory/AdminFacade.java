package Factory;

public class AdminFacade implements ClientFacade{
    @Override
    public AdminFacade login(String use , String password) {
        return this;
    }

    @Override
    public String toString() {
        return "AdminFacade";
    }
}
