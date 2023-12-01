public class ClassNotFoundExceptionExample {

    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass"); 
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}
