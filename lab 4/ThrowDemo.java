class ThrowDemo
{
   public void checkAge(int age)
   {
       if(age<18)
       {
           throw new ArithmeticException("not valid");
       }
       else
       {
           System.out.println("Valid");
       }
       
   }
   public static void main(String[] args)
   {
       ThrowDemo obj = new ThrowDemo();
       try {
        obj.checkAge(13);
           
       } 
       catch (Exception e) {
        System.out.println(e.getMessage());
       }
      
   }
}