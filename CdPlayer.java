package solution;

public class CdPlayer implements IPushCallBack{
    private Button playButton;
    private Button stopButton;
    public final void notifyButtonPushed(Button b){
        if(b == playButton) this.playButtonPushed(b);
        if(b == stopButton) this.stopButtonPushed(b);
    }
    //设置播放按钮
    public final void setPlayButton(Button b){
        playButton = b;
    }
    //set stop button
    public final void setStopButton(Button b){
        stopButton = b;
    }
    public final void playButtonPushed(Button b){
        System.out.println("Play button pushed \n");
    }
    public final void stopButtonPushed(Button b){
        System.out.println("Stop button pushed \n");
    }
}
