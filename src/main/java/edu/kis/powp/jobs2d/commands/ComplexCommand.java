package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands = new ArrayList<>();

    public void addCommand(DriverCommand cmd) {
        commands.add(cmd);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand cmd : commands) {
            cmd.execute(driver);
        }
    }
}
