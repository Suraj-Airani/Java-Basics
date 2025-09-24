package file_handling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello I'm Suraj");
            bufferedWriter.newLine();
            bufferedWriter.write("This is Java writing code");
            bufferedWriter.close();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error: "+e.getMessage());
        }
    }
}
