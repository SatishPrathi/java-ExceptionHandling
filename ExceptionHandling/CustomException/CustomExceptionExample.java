class SatishException extends Exception {
    public SatishException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {

            int age = -5;
            if (age < 0) {

                throw new SatishException("Age cannot be negative, Satish!");
            } else {
                System.out.println("Satish's age is: " + age);
            }
        } catch (SatishException e) {

            System.err.println("SatishException: " + e.getMessage());
        }
    }
}
