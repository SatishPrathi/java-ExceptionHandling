public class Throw3 {
    public static void main(String[] args) {
        try {
            checkValue(5);
            checkValue(15);
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    static void checkValue(int value) {
        if (value > 10) {
            throw new CustomException("Value should not exceed 10");
        }
        System.out.println("Value is acceptable: " + value);
    }
}

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
