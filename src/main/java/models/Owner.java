package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="owners")

public class Owner {
    private int id;
    private String name;
    private List<Folder> folders;

    public Owner(String name){
        this.id = id;
        this.name = name;
    }

    public Owner(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @OneToMany(mappedBy ="owner", fetch = FetchType.LAZY)
    public List<Folder> getFolders(){
        return this.folders;
    }

    public void setFolders(List<Folder> folders){
        this.folders = folders;
    }
}
