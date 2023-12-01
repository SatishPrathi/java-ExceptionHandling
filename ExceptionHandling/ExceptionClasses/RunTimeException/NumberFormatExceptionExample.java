public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        try {
            String invalidNumber = "abc";
            int value = Integer.parseInt(invalidNumber); 
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: " + e.getMessage());
        }
    }
}
