public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[10]); // This line will throw an ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch block: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer catch block: " + e.getMessage());
        }
    }
}
