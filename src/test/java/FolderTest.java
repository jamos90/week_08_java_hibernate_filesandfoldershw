import models.Folder;
import models.Owner;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FolderTest {

    Folder folder;
    Owner owner;

    @Before
    public void setUp(){
        folder = new Folder("Holiday Photos", owner);
    }

    @Test
    public void hasTitle(){
        assertEquals("Holiday Photos",folder.getTitle());
    }

    @Test
    public void hasAOwner(){
        assertEquals(owner,folder.getOwner());
    }
}
