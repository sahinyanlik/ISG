import java.lang.Override;

public class GreetingService implements GreetingServiceInt{
    @Override
    public String hello(){
        return "hiii";
    }
}