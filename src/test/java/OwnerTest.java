import models.Owner;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OwnerTest {

    Owner owner;

    @Before
    public void setUp(){
        owner = new Owner("James");
    }

    @Test
    public void hasName(){
        assertEquals("James", owner.getName());
    }
}
