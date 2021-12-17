package lab10.v2;

import java.util.Stack;

// Invoker
public class Editor {
    private Stack<Command> history = new Stack<>(); // păstrează comenzile aplicate pe imagine

    public void edit(Command command) {
        history.push(command);
        command.execute();
    }

    public void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
