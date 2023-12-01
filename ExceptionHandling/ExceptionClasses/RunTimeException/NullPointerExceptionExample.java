public class NullPointerExceptionExample {

    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); 
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        }
    }
}
