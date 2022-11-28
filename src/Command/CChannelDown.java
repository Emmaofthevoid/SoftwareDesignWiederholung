package Command;

public class CChannelDown implements Command {
    TV tv;

    public CChannelDown(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.channelDown();
    }

    @Override
    public void undo() {
        tv.channelUp();
    }
}
