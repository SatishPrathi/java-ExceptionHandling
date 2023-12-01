public class Example {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);

        } 
        catch (ArithmeticException e) {
            
        System.out.println("Exception caught: " + e.getMessage());
        }

           finally {
            System.out.println("This block will always be executed.");
        }
    }
}
