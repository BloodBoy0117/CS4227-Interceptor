package Interceptor;

import java.util.ArrayList;
import java.util.List;

public class ContextObject {

    private String value;

    public void setValue(String value) {
        System.out.println("set system value");
        this.value = value;
    }

    public String getValue() {
        System.out.println("get system value");
        return value;
    }

    public void consume_service(){
        System.out.println("consume service");
    };

    public void beforePlay(){
        //Intercept before playing
        System.out.println("Intercept before playing");//用contextobject获取信息
    }
    public void afterPlay(){
        //Intercept after play
        System.out.println("Intercept after play");
    }
    public void beforeStop(){
        //Intercept before stopping
        System.out.println("Intercept before stopping");
    }
    public void afterStop(){
        //intercept after stop
        System.out.println("intercept after stop");
    }

}
