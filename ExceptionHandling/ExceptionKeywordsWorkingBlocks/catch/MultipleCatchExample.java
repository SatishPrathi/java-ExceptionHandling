public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int result = divideByZero();
            String str = null;
            System.out.println(str.length()); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    static int divideByZero() {
        return 10 / 0;
    }
}
