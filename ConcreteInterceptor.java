package Interceptor;

public class ConcreteInterceptor implements Interceptor{


    //Interception group (interception group is divided into stop behavior interception and play behavior interception)
    @Override
    public void play_CallBack(String target,ContextObject contextObject) {
        if(target.equals("before")){
            new ContextObject().beforePlay();
        }else{
            new ContextObject().afterPlay();
        }
    }
    @Override
    public void stop_CallBack(String target,ContextObject contextObject) {
        if(target.equals("before")){
            new ContextObject().beforeStop();
        }else{
            new ContextObject().afterStop();
        }
    }
//    //Define interception points (intercept before playback, intercept after playback, intercept before stop, intercept after stop)
//    private void beforePlay(){
//        //播放前拦截
//        System.out.println("播放前拦截");//用contextobject获取信息
//    }
//    private void afterPlay(){
//        //播放后拦截
//        System.out.println("播放后拦截");
//    }
//    private void beforeStop(){
//        //停止前拦截
//        System.out.println("停止前拦截");
//    }
//    private void afterStop(){
//        //停止后拦截
//        System.out.println("停止后拦截");
//    }
}
