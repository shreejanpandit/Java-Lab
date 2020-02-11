class FinallyDemo
{
    int a = 5;
    public int checkException()
    {
        try {
            System.out.println(a/0);
        }
        catch (Exception e) {
            return 0;
        }
        finally
        {
            System.out.println("Please restart your application!");
            return 1;

        }
    }
    
    public static void main(String[] args) 
    {
        TryDemo obj = new TryDemo();  
        obj.checkException(); 
    }
}