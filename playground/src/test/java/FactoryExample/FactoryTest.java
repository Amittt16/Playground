package FactoryExample;

import Factory.AdminFacade;
import Factory.ClientFacade;
import Factory.FacadeFactory;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static Factory.ClientType.ADMIN;

public class FactoryTest {

    @Test
    public void factoryExample(){
        Optional<ClientFacade> facade = FacadeFactory.getClient("admin" , "admin123" , ADMIN);
        if(facade.isPresent()){
            AdminFacade adminFacade = (AdminFacade) facade.get();
            System.out.println(adminFacade);
        }
    }
}
