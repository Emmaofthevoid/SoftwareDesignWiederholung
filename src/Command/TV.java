package Command;

public class TV {

    public boolean istEin = false;
    int channel = 1;

    public void turnOn() {
        if (istEin)
            System.out.println("TV is already on.");

        else {
            istEin = true;
            System.out.println("TV was turned on.");
        }
    }

    public void turnOff() {
        if (!istEin)
            System.out.println("TV is already off.");

        else {
            istEin = false;
            System.out.println("TV was turned off.");
        }
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }
}
