package Command;

public class Main {
    public static void main(String[] args) {

        TV tv = new TV();
        Light light = new Light();

        Command c1 = new CTvOn(tv);
        Command c2 = new CTvOff(tv);
        Command c3 = new CLightOn(light);
        Command c4 = new CLightOff(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.addCommand(1, c1);
        remoteControl.addCommand(2, c2);
        remoteControl.addCommand(3, c3);
        remoteControl.addCommand(4, c4);

        remoteControl.pressButton(1);
        remoteControl.pressButton(1);
        remoteControl.pressButton(2);
        remoteControl.pressButton(3);




    }
}
