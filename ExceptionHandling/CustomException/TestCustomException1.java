class SatishAgeException  extends Exception  
{  
    public SatishAgeException (String str)  
    {  

        super(str);  
    }  
}  
    
public class TestCustomException1  
{  
  
    static void validate (int age) throws SatishAgeException{    
       if(age < 18){  
  
        throw new SatishAgeException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    public static void main(String args[])  
    {  
        try  
        {  
            validate(13);  
        }  
        catch (SatishAgeException ex)  
        {  
            System.out.println("Caught the exception");  
    
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  
}  
