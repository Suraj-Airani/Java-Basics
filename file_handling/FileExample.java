package file_handling;
import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        if(myFile.exists())
            System.out.println("file exists");
        else
            System.out.println("file do not exist");
    }
}
