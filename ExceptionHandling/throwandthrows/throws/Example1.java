import java.io.FileNotFoundException;

public class Example1 {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        }
        catch (FileNotFoundException e) 
        {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }


    static void readFile(String filename) throws FileNotFoundException {
        
     throw new FileNotFoundException("File not found: " + filename);
    }
}
