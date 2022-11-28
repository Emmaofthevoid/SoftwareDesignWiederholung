package Command;

public class CTvOn implements Command {

    TV tv;

    public CTvOn(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }



}
