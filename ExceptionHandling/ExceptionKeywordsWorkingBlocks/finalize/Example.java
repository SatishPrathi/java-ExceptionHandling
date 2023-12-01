public class Example {

    protected void finalize() throws Throwable {
        try {

            System.out.println("Finalizing resources...");
        } finally {
            
         super.finalize();
        }
    }

    public static void main(String[] args) {
        Example obj = new Example();

        obj = null; // Making the object eligible for garbage collection

        System.gc(); // Suggesting garbage collection (not guaranteed to run immediately)
    }
}
