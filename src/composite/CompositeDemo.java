package composite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

interface FileSystem{
    void printInfo();
    Double getSize();
}

class FFile implements FileSystem{

    private Double size;
    private String name;

    public FFile(Double size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("Size : "+ size);
        System.out.println("File Name: "+ name);
    }

    @Override
    public Double getSize() {
        return size;
    }
}

class FFolder implements FileSystem{

    private List<FileSystem> fileSystems = new ArrayList<>();
    private Double size;
    private String fileName;
    public FFolder(Double size, String fileName) {
        this.size = size;
        this.fileName = fileName;
    }

    @Override
    public void printInfo() {
        System.out.println("Size :" +size);
        System.out.println("File Name"+ fileName);
    }

    @Override
    public Double getSize() {
        return size;
    }

    public void addFileSystem(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }
}

public class CompositeDemo {
    public static void main(String[] args) {

        FileSystem file1 = new FFile(1.00,"sakkda.exe");
        FileSystem file2 = new FFile(9.00,"Antivirus.exe");
        FFolder folder0 = new FFolder(file1.getSize(),"MyFile");
        folder0.addFileSystem(file1);
        FFolder folder = new FFolder(file2.getSize()
                + folder0.getSize(), "MyFileInfo");
        folder.addFileSystem(folder0);
        folder.addFileSystem(file1);
        folder.addFileSystem(file2);
        folder.printInfo();
        folder0.printInfo();

    }
}
