public class MultipleCatchExample1 {
    public static void main(String[] args) {
        try {
            String[] numbers = {"one", "two", "three"};
            int index = Integer.parseInt("abc"); 
            System.out.println(numbers[index]); 

        } 
          catch (NumberFormatException e) 
        {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
         catch (ArrayIndexOutOfBoundsException e) 
         {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
