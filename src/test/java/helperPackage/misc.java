package helperPackage;

public class misc{
    public static void  sleep(int seconds){
        try{
            Thread.sleep(seconds+1000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
