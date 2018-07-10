import models.Folder;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FolderTest {

    Folder folder;

    @Before
    public void setUp(){
        folder = new Folder("Holiday Photos");
    }

    @Test
    public void hasTitle(){
        assertEquals("Holiday Photos",folder.getTitle());
    }
}
