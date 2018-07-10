package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="folders")

public class Folder {
    private int id;
    private String title;
    private List<File> files;

    public Folder(String title){
        this.id = id;
        this.title = title;
    }

    public Folder(){

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
