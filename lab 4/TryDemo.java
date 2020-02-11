class TryDemo
{
    int a = 5;
    public void checkException()
    {
        try {
            System.out.println(a/0);
        }
        catch (Exception e) {
            System.out.println("Not Divisable by Zero");
        }
    }
    
    public static void main(String[] args) 
    {
        TryDemo obj = new TryDemo();  
        obj.checkException(); 
    }
}