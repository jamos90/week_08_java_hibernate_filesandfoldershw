package models;

import javax.persistence.*;
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
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    @OneToMany
    @JoinColumn(name = "folder")
    public List<File> getFiles(){
        return this.files;
    }

    public void setFiles(List<File> files){
        this.files = files;
    }
}
