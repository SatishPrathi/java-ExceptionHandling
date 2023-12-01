public class IllegalArgumentExceptionExample {

    public static void main(String[] args) {
        try {
            validateAge(-5); 
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }
    }

    private static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be non-negative");
        }
    }
}
