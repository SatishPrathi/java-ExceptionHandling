public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5]; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
