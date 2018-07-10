import models.File;
import models.Folder;
import org.junit.Before;

public class FileTest {
    File file;
    Folder photos;
    Folder doucments;

    @Before
    public void setUp(){
        photos = new Folder()
        file = new File("Photo_1",".jpg",2,photos);
    }
}
