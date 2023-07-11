package Factory;

import java.util.Optional;

public class FacadeFactory {

    public static Optional<ClientFacade> getClient(String user , String password , ClientType type){
        switch (type) {
            case ADMIN:
                return Optional.ofNullable(new AdminFacade().login(user , password));
            case CUSTOMER:
                return Optional.ofNullable(new CustomerFacade().login(user , password));
            case COMPANY:
                return Optional.ofNullable(new CompanyFacade().login(user , password));
            default:
                return Optional.empty();
        }
    }
}
