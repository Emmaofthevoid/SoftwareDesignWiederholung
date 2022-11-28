package Command;

import java.util.HashMap;
import java.util.Stack;

public class RemoteControl {

    HashMap<Integer, Command> listOfCommands = new HashMap<>();
    Stack<Command> history = new Stack<>();

    public void addCommand( int slot, Command c ) {
        if (listOfCommands.containsKey(slot)) {
            System.out.println("slot already in use, please choose another one...");
        }
        listOfCommands.put(slot, c);
    }

    public void pressButton(int buttonSlot) {
        if (listOfCommands.containsKey(buttonSlot)) {
            Command c = listOfCommands.get(buttonSlot);
            c.execute();
            history.push(c);
        } else {
            System.out.println("No Command in the chosen slot...");
        }
    }

    public void undoButton() {
        if (history.empty()) {
            System.out.println("No more Commands in the history...");
        }
        System.out.println("Popping Command...");
        history.pop().undo();
    }


}
