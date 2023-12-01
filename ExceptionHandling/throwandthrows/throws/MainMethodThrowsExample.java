import java.io.FileNotFoundException;

public class MainMethodThrowsExample {
    public static void main(String[] args) throws FileNotFoundException {
        try {


            processFile("example.txt");
        } catch (FileNotFoundException e)
       
         {
            System.out.println("Caught exception in main method: " + e.getMessage());
        }
    }


    static void processFile(String filename) throws FileNotFoundException 
     
      {
      

        throw new FileNotFoundException("File not found: " + filename);
    }
}
