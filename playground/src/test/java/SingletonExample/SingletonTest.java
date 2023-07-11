package SingletonExample;

import Singleton.Singleton;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void singleton(){
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        if (object1 == object2){
            object1.showMessage();
        }
    }
}
