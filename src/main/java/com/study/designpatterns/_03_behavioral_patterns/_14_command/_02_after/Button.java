package com.study.designpatterns._03_behavioral_patterns._14_command._02_after;

import com.study.designpatterns._03_behavioral_patterns._14_command._01_before.Game;
import com.study.designpatterns._03_behavioral_patterns._14_command._01_before.Light;

import java.util.Stack;

public class Button {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command pop = commands.pop();
            pop.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand( new Light()));
        button.undo();
        button.undo();
    }
}
