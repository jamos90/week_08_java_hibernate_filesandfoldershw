package models;

public class File {
    private int id;
    private String name;
    private String extension;
    private int size;
    private Folder folder;

    public File(String name, String extension, int size, Folder folder){
        this.id = id;
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File(){

    }


}
