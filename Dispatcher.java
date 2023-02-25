package Interceptor;

import solution.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * The function of this class is: register interception service for a certain behavior and remove interception service (scheduling of interception service)
 * Allows applications to register and remove ConcreteInterceptors
 */
public class Dispatcher {

    private Interceptor playBeforeInterceptor;
    private Interceptor playAfterInterceptor;
    private Interceptor stopBeforeInterceptor;
    private Interceptor stopAfterInterceptor;

    public Interceptor setPlayBeforeInterceptor(Interceptor i){
        playBeforeInterceptor = i;
        return playBeforeInterceptor;
    }
    public Interceptor setPlayAfterInterceptor(Interceptor i){
        playAfterInterceptor = i;
        return playAfterInterceptor;
    }

    public Interceptor setStopBeforeInterceptor(Interceptor i){
        stopBeforeInterceptor = i;
        return stopBeforeInterceptor;
    }
    public Interceptor setStopAfterInterceptor(Interceptor i){
        stopAfterInterceptor = i;
        return stopAfterInterceptor;
    }

    //Define collections, interception behaviors that storage services need to perform定义集合，存储服务需要执行的拦截行为
    private List<Interceptor> interceptorList = new ArrayList<Interceptor>();

    public void registerInterceptor(Interceptor i){
        interceptorList.add(i);
    }
    public void removeInterceptor(Interceptor i){
        interceptorList.remove(i);
    }
    public List<Interceptor> interceptorList(){
        return interceptorList;
    }
    public void dispatch(ContextObject contextObject){
        for(Interceptor i:interceptorList){
            if(i == playBeforeInterceptor){
                i.play_CallBack("before",contextObject);
            }
            if(i == playAfterInterceptor){
                i.play_CallBack("after",contextObject);
            }
            if(i == stopBeforeInterceptor){
                i.stop_CallBack("before",contextObject);
            }
            if(i == stopAfterInterceptor){
                i.stop_CallBack("after",contextObject);
            }
        }

    }
}
