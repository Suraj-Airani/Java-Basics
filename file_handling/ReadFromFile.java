package file_handling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
    
            while((line=bufferedReader.readLine())!=null)
                System.out.println(line);
            bufferedReader.close();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error: "+e.getMessage());
        }
    }
}
