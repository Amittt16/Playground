package Factory;

public class CompanyFacade implements ClientFacade{
    @Override
    public CompanyFacade login(String user , String password) {
        return this;
    }

    @Override
    public String toString() {
        return "CompanyFacade";
    }
}
