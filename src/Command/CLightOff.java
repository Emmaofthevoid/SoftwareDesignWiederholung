package Command;

public class CLightOff implements Command {
    Light light;

    public CLightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();

    }
}
