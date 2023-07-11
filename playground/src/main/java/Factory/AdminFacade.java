package Factory;

public class AdminFacade implements ClientFacade{
    @Override
    public AdminFacade login(String user , String password) {
        return this;
    }

    @Override
    public String toString() {
        return "AdminFacade";
    }
}
