import models.File;
import models.Folder;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FileTest {
    File file;
    Folder photos;
    Folder doucments;

    @Before
    public void setUp(){
        photos = new Folder("Holiday Photos");
        file = new File("Photo_1",".jpg",2,photos);
    }

    @Test
    public void hasName(){
        assertEquals("Photo_1",file.getName());
    }

    @Test
    public void hasExtension(){
        assertEquals(".jpg",file.getExtension());
    }

    @Test
    public void hasSize(){
        assertEquals(2,file.getSize());
    }

    @Test
    public void hasAFolder(){
        assertEquals(photos,file.getFolder());
    }
}
