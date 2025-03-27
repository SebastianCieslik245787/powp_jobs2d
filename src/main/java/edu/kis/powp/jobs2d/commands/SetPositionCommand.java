package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class SetPositionCommand implements DriverCommand {
    private final int x;
    private final int y;

    @Override
    public void execute(Job2dDriver driver) {
        driver.setPosition(x, y);
    }

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
