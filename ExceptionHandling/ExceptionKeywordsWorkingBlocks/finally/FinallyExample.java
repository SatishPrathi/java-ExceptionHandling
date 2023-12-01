public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Try block: This code may throw an exception.");
        } 
        catch (Exception e) 
         {
         
         System.out.println("Catch block: Exception caught.");
        }
       finally
           {
            System.out.println("Finally block: This code always executes.");
        }
    }
}
