import db.DBFolder;
import db.DBHelper;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args){
        ;
        Owner owner = new Owner("James");

        Folder photos = new Folder("Holiday Photos",owner);
        DBHelper.save(photos);

        File file1 = new File("Photo_1",".jpg",33, photos);
        DBHelper.save(file1);

        File file2 = new File("Photo_2",".png",40,photos);
        DBHelper.save(file2);

        file1.setName("Vietnam1");
        DBHelper.update(file1);

        List<File> files = DBHelper.getALl(File.class);

        File fileToFind = DBHelper.find(File.class,2);

        File fileToFind2 = DBHelper.find(File.class, "Vietnam1");

        List<File> filesInFolder = DBFolder.getFiles(photos);


    }
}
