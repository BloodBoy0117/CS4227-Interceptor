package Interceptor;

import solution.Button;
import solution.CdPlayer;

/**
 * Instantiate ConcreteInterceptors and register them with the Dispatcher
 */
public class Application {
    public static void do_work(){
        CdPlayer cdPlayer = new CdPlayer();

        Button playButton = new Button(cdPlayer);
        Button stopButton = new Button(cdPlayer);

        cdPlayer.setPlayButton(playButton);
        cdPlayer.setStopButton(stopButton);
        //Set interception pointcut
        Dispatcher dispatcher = new Dispatcher();
        //Intercept twice before registering to play
        Interceptor playInterceptorBefore = dispatcher.setPlayBeforeInterceptor(new ConcreteInterceptor());
        dispatcher.registerInterceptor(playInterceptorBefore);//register interception
        dispatcher.registerInterceptor(playInterceptorBefore);//register interception
//        dispatcher.removeInterceptor(playInterceptorBefore);//cancel interception
        dispatcher.dispatch(new ContextObject());
        playButton.push();
        stopButton.push();
        //Set interception pointcut
        Dispatcher dispatcher_ = new Dispatcher();
        //Intercept once after stopping
        Interceptor stopInterceptorAfter = dispatcher_.setStopAfterInterceptor(new ConcreteInterceptor());
        dispatcher_.registerInterceptor(stopInterceptorAfter);//register interception
        dispatcher_.dispatch(new ContextObject());


    }
}
