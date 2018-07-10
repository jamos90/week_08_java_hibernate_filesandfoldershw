package models;

import java.util.List;

public class Folder {
    private int id;
    private String title;
    private List<File> files;

    public Folder(String title){
        this.title = title;
        this.id = id;
    }

    public Folder(){

    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
