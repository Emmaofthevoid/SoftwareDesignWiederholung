package Command;

public class CChannelUp implements Command{

    TV tv;

    public CChannelUp(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.channelUp();
    }

    @Override
    public void undo() {
        tv.channelDown();
    }
}
