import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("nonexistent.txt"); // This line may throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
        }
    }
}
