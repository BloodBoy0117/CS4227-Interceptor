package Interceptor;

/**
 * Define the interception method
 */
public interface Interceptor {
    public void play_CallBack(String target,ContextObject contextObject);//Define the play interception method
    public void stop_CallBack(String target,ContextObject contextObject);//Define the stop interception method
}
