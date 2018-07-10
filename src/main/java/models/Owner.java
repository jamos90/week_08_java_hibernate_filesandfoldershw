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
}
