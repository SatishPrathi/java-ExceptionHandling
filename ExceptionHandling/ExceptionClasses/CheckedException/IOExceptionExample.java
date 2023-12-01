import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("nonexistent.txt"); 
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
